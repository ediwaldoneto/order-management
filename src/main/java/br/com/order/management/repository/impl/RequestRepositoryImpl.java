package br.com.order.management.repository.impl;

import br.com.order.management.model.Request;
import br.com.order.management.repository.RequestRepository;
import br.com.order.management.repository.sql.OrderManagementQuerys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class RequestRepositoryImpl implements RequestRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    /**
     * @param request
     */
    @Override
    public void save(Request request) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("subject", request.getSubject());
        source.addValue("description", request.getDescription());
        source.addValue("creationDate" , request.getCreationDate());
        source.addValue("requestState" , request.getRequestState());
        source.addValue("userId" , request.getUserId());

        jdbcTemplate.update(OrderManagementQuerys.INSERT_REQUEST, source);
    }

    /**
     * @param id
     * @param state
     */
    @Override
    public void updateRequestState(Long id, String state) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("id", id);
        source.addValue("state", state);

        jdbcTemplate.update(OrderManagementQuerys.UPDATE_REQUEST, source);
    }
}
