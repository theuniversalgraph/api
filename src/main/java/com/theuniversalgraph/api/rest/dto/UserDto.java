package com.theuniversalgraph.api.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import com.theuniversalgraph.model.*;

public class UserDto {

    public UserDto() {}

    @JsonProperty("id")
    public String id;
}
