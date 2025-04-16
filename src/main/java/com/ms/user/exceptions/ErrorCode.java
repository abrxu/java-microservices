package com.ms.user.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {

    INCORRECT_CREDENTIALS("incorrect_credentials", HttpStatus.BAD_REQUEST, "Credenciais incorretas."),
    USER_NOT_FOUND("user_not_found", HttpStatus.NO_CONTENT, "Usuário não encontrado no sistema");

    final String code;
    final HttpStatusCode statusCode;
    final String message;

    ErrorCode(String code, HttpStatusCode statusCode, String message) {
        this.code = code;
        this.statusCode = statusCode;
        this.message = message;
    }
}
