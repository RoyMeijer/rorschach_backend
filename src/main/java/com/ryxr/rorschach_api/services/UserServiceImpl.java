package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.exceptions.UserNotFoundException;
import com.ryxr.rorschach_api.models.User;
import com.ryxr.rorschach_api.repository.AnswerRepository;
import com.ryxr.rorschach_api.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser() {
        User user = new User();
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User patchUser(User user) throws UserNotFoundException {
        User existingUser = findOne(user.getId());
        BeanUtils.copyProperties(user, existingUser, "id");
        return userRepository.saveAndFlush(existingUser);
    }

    private User findOne(UUID userId) throws UserNotFoundException {
        return userRepository.findById(userId).orElseThrow(
                () -> new UserNotFoundException("Can't find user with this id: " + userId)
        );
    }
}
