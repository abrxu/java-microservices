package com.ms.user.services;

import com.ms.user.models.User.DTOs.UserCreationRequestDTO;
import com.ms.user.models.User.User;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User createUser(@Valid UserCreationRequestDTO dto) {
        User user = new User(dto.name(), dto.email());
        return userRepository.save(user);
    }
}
