package com.accommodationbooking.security.service;

import com.accommodationbooking.dto.user.UserLoginRequestDto;
import com.accommodationbooking.dto.user.UserLoginResponseDto;
import com.accommodationbooking.dto.user.UserRegistrationRequestDto;
import com.accommodationbooking.dto.user.UserResponseDto;

public interface AuthenticationService {
    UserResponseDto register(final UserRegistrationRequestDto registrationDto);

    UserLoginResponseDto login(final UserLoginRequestDto loginDto);
}
