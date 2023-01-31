package com.spring.client.service;

import com.spring.client.entity.User;
import com.spring.client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
