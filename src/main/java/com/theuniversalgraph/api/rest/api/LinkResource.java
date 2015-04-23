package com.theuniversalgraph.api.rest.api;

import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import com.theuniversalgraph.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.theuniversalgraph.api.rest.dto.LinkDto;
import com.theuniversalgraph.api.rest.service.LinkService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Links")
@Api(value = "Link API")
public class LinkResource {

    @Autowired
    private LinkService linkService;

    @RequestMapping(method = RequestMethod.GET)
    public List<LinkDto> getAllLinks() {
        return linkService.getAllLinks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LinkDto getLink(@PathVariable final String id) {
        return linkService.getLink(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<LinkDto> addLink(@RequestBody final LinkDto link) {
        LinkDto createdLink = linkService.createLink(link);
        return new ResponseEntity<>(createdLink, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteLink(@PathVariable final String id) {
        linkService.deleteLink(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<LinkDto> updateLink(@PathVariable final String id, @RequestBody final LinkDto link) {
        LinkDto createdLink = linkService.updateLink(id, link);
        return new ResponseEntity<>(createdLink, HttpStatus.OK);
    }
}
