package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.exceptions.UserNotFoundException;
import com.ryxr.rorschach_api.models.User;

public interface UserService {
    User createUser();
    User patchUser(User user) throws UserNotFoundException;
}
