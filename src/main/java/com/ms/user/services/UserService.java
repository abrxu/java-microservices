package com.ms.user.services;

import com.ms.user.models.User.DTOs.UserCreationRequestDTO;
import com.ms.user.models.User.User;
import com.ms.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserCreationRequestDTO dto) {
        User user = new User(dto.name(), dto.email());
        return userRepository.save(user);
    }
}
