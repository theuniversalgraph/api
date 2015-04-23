package com.theuniversalgraph.api.rest.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.converter.UserConverter;
import com.theuniversalgraph.api.rest.dto.UserDto;
import com.theuniversalgraph.api.rest.entity.UserEntity;
import com.theuniversalgraph.api.rest.repository.UserRepository;
import com.theuniversalgraph.model.*;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

        public List<UserDto> getAllUsers(){
        return userConverter.toDto(userRepository.findAll());
    }

    public UserDto getUser(final String id){
        return userConverter.toDto(userRepository.findOne(id));
    }

    public UserDto createUser(UserDto userDto){
        UserEntity userEntity = userConverter.fromDto(userDto);
        return userConverter.toDto(userRepository.save(userEntity));
    }

    public UserDto updateUser(String id, UserDto userDto){
        userRepository.delete(id);
        UserEntity userEntity = userConverter.fromDto(userDto);
        return userConverter.toDto(userRepository.save(userEntity));
    }

    public void deleteUser(String id){
        userRepository.delete(id);
    }
}
