package com.theuniversalgraph.api.rest.api;

import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import com.theuniversalgraph.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.theuniversalgraph.api.rest.dto.UserDto;
import com.theuniversalgraph.api.rest.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Users")
@Api(value = "User API")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserDto getUser(@PathVariable final String id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserDto> addUser(@RequestBody final UserDto user) {
        UserDto createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteUser(@PathVariable final String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<UserDto> updateUser(@PathVariable final String id, @RequestBody final UserDto user) {
        UserDto createdUser = userService.updateUser(id, user);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }
}
