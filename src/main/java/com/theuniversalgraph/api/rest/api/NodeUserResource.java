package com.theuniversalgraph.api.rest.api;

import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import com.theuniversalgraph.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.theuniversalgraph.api.rest.dto.NodeUserDto;
import com.theuniversalgraph.api.rest.service.NodeUserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/NodeUsers")
@Api(value = "NodeUser API")
public class NodeUserResource {

    @Autowired
    private NodeUserService nodeUserService;

    @RequestMapping(method = RequestMethod.GET)
    public List<NodeUserDto> getAllNodeUsers() {
        return nodeUserService.getAllNodeUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public NodeUserDto getNodeUser(@PathVariable final String id) {
        return nodeUserService.getNodeUser(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<NodeUserDto> addNodeUser(@RequestBody final NodeUserDto nodeUser) {
        NodeUserDto createdNodeUser = nodeUserService.createNodeUser(nodeUser);
        return new ResponseEntity<>(createdNodeUser, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteNodeUser(@PathVariable final String id) {
        nodeUserService.deleteNodeUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<NodeUserDto> updateNodeUser(@PathVariable final String id, @RequestBody final NodeUserDto nodeUser) {
        NodeUserDto createdNodeUser = nodeUserService.updateNodeUser(id, nodeUser);
        return new ResponseEntity<>(createdNodeUser, HttpStatus.OK);
    }
}
