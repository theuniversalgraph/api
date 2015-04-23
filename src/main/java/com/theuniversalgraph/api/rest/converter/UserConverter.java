package com.theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.dto.UserDto;
import com.theuniversalgraph.api.rest.entity.UserEntity;
import com.theuniversalgraph.model.*;

@Service
public class UserConverter extends AbstractConverter<UserEntity, UserDto> {

    @Override
    public void toDto(final UserEntity entity, final UserDto dto) {
        // convert UserEntity to UserDto

    }

    @Override
    public void fromDto(final UserEntity entity, final UserDto dto) {
        // convert UserDto to UserEntity
    }
}
