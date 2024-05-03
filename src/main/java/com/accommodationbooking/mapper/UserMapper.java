package com.accommodationbooking.mapper;

import com.accommodationbooking.config.mapper.MapperConfig;
import com.accommodationbooking.dto.user.UserRegistrationRequestDto;
import com.accommodationbooking.dto.user.UserResponseDto;
import com.accommodationbooking.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserResponseDto toDto(final User user);

    User toModel(final UserRegistrationRequestDto registrationDto);
}
