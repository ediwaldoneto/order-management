package br.com.order.management.repository.impl;

import br.com.order.management.model.User;
import br.com.order.management.repository.UserRepository;
import br.com.order.management.repository.sql.OrderManagementQuerys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("name", user.getName());
        source.addValue("email", user.getEmail());
        source.addValue("password", user.getPassword());
        source.addValue("role", user.getRole());

        jdbcTemplate.update(OrderManagementQuerys.INSERT_USER, source);
    }

    @Override
    public User findById(Long id) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("id", id);
        return jdbcTemplate.queryForObject(OrderManagementQuerys.SEARCH_BY_ID, source, mapperUser());
    }

    @Override
    public void delete(Long id) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("id", id);
        jdbcTemplate.update(OrderManagementQuerys.DELETE_USER, source);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(OrderManagementQuerys.FIND_ALL, mapperUser());
    }

    @Override
    public void update(User user) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("id", user.getId());
        source.addValue("name", user.getName());
        source.addValue("email", user.getEmail());
        source.addValue("password", user.getPassword());
        source.addValue("role", user.getRole());
        jdbcTemplate.update(OrderManagementQuerys.UPDATE_USER, source);
    }

    private RowMapper<User> mapperUser() {
        return (rs, rowNum) -> {
            final User user = new User();
            user.setId(rs.getLong("ID"));
            user.setName(rs.getString("NAME"));
            user.setEmail(rs.getString("EMAIL"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setRole(rs.getString("ROLE"));
            return user;
        };
    }
}
