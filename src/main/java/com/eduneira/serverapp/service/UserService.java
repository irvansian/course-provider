package com.eduneira.serverapp.service;

import com.eduneira.serverapp.model.User;
import com.eduneira.serverapp.payload.ApiResponse;
import com.eduneira.serverapp.payload.UserIdentityAvailability;
import com.eduneira.serverapp.payload.UserProfile;
import com.eduneira.serverapp.payload.UserSummary;
import com.eduneira.serverapp.payload.request.InfoRequest;
import com.eduneira.serverapp.security.UserPrincipal;

public interface UserService {
    UserSummary getCurrentUser(UserPrincipal currentUser);

    UserIdentityAvailability checkUsernameAvailability(String username);

    UserIdentityAvailability checkEmailAvailability(String email);

    UserProfile getUserProfile(String username);

    User addUser(User user);

    User updateUser(User newUser, String username, UserPrincipal currentUser);

    ApiResponse deleteUser(String username, UserPrincipal currentUser);

    ApiResponse giveAdmin(String username);

    ApiResponse removeAdmin(String username);

    UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}
