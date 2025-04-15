package com.ms.user.models.User.DTOs;

import java.util.UUID;

public record UserCreationResponseDTO(UUID id, String name, String email) {
}
