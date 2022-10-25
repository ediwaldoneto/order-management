package br.com.order.management.repository;

import br.com.order.management.model.User;

import java.util.List;

public interface UserRepository {

    public void save(User user);
    public User findById(Long id);
    public void delete(Long id);
    public List<User> findAll();
    public void update(Long id);
}
