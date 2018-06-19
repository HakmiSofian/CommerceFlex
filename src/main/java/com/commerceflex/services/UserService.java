package com.commerceflex.services;

import java.util.List;

import com.commerceflex.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}