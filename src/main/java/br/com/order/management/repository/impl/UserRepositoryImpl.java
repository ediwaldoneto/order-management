package br.com.order.management.repository.impl;

import br.com.order.management.model.User;
import br.com.order.management.repository.UserRepository;
import br.com.order.management.repository.sql.OrderManagementQuerys;
import org.springframework.beans.factory.annotation.Autowired;
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
        source.addValue("password",user.getPassword());
        source.addValue("role", user.getRole());

        jdbcTemplate.update(OrderManagementQuerys.INSERT, source);
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO document why this method is empty
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User update() {
        return null;
    }
}
