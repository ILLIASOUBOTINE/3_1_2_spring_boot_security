package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService  {
    void add(User user);
    List<User> listUsers();
    void update(User user);
    void delete(Long id);
    User findById(Long id);
    User findByEmail(String email);
    void registerUser(User user, List<String> roles);
    User getAuthenticatedUser();
}
