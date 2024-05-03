package com.accommodationbooking.error;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Collection;

public record ApiError(
        LocalDateTime timestamp,
        HttpStatus status,
        int code,
        Collection<String> errors
) {
}
