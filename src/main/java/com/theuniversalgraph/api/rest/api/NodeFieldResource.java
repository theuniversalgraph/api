package com.theuniversalgraph.api.rest.api;

import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import com.theuniversalgraph.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.theuniversalgraph.api.rest.dto.NodeFieldDto;
import com.theuniversalgraph.api.rest.service.NodeFieldService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/NodeFields")
@Api(value = "NodeField API")
public class NodeFieldResource {

    @Autowired
    private NodeFieldService nodeFieldService;

    @RequestMapping(method = RequestMethod.GET)
    public List<NodeFieldDto> getAllNodeFields() {
        return nodeFieldService.getAllNodeFields();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public NodeFieldDto getNodeField(@PathVariable final String id) {
        return nodeFieldService.getNodeField(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<NodeFieldDto> addNodeField(@RequestBody final NodeFieldDto nodeField) {
        NodeFieldDto createdNodeField = nodeFieldService.createNodeField(nodeField);
        return new ResponseEntity<>(createdNodeField, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteNodeField(@PathVariable final String id) {
        nodeFieldService.deleteNodeField(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<NodeFieldDto> updateNodeField(@PathVariable final String id, @RequestBody final NodeFieldDto nodeField) {
        NodeFieldDto createdNodeField = nodeFieldService.updateNodeField(id, nodeField);
        return new ResponseEntity<>(createdNodeField, HttpStatus.OK);
    }
}
