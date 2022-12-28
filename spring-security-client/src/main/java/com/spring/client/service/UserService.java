package com.spring.client.service;

import com.spring.client.entity.User;
import com.spring.client.entity.VerificationToken;
import com.spring.client.model.UserModel;

import java.util.Optional;

public interface UserService {
    User registerUser(UserModel userModel);
    void saveVerificationTokenForUser(String token, User user);
    String validateVerificationToken(String token);
    VerificationToken generateNewVerificationToken(String oldToken);
    User findUserByEmail(String email);
    void createPasswordResetTokenForUser(User user, String token);
    String validatePasswordResetToken(String token);
    Optional<User> getUserByPasswordResetToken(String token);
    void changePassword(User user, String newPassword);
    boolean checkIfValidOldPassword(User user, String oldPassword);
}
