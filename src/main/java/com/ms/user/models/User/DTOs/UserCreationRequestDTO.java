package com.ms.user.models.User.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserCreationRequestDTO(@NotNull(message = "O nome não pode ser vazio.")
                                     @NotBlank(message = "O nome não pode ser vazio.")
                                     String name,

                                     @Email(message = "Digite um email válido.")
                                     String email) {}
