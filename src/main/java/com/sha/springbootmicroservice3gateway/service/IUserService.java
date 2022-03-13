package com.sha.springbootmicroservice3gateway.service;

import com.sha.springbootmicroservice3gateway.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUserName(String username);

    List<User> findAllUsers();
}
