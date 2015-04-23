package com.theuniversalgraph.api.rest.api;

import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import com.theuniversalgraph.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.theuniversalgraph.api.rest.dto.LinkUseDto;
import com.theuniversalgraph.api.rest.service.LinkUseService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/LinkUses")
@Api(value = "LinkUse API")
public class LinkUseResource {

    @Autowired
    private LinkUseService linkUseService;

    @RequestMapping(method = RequestMethod.GET)
    public List<LinkUseDto> getAllLinkUses() {
        return linkUseService.getAllLinkUses();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LinkUseDto getLinkUse(@PathVariable final String id) {
        return linkUseService.getLinkUse(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<LinkUseDto> addLinkUse(@RequestBody final LinkUseDto linkUse) {
        LinkUseDto createdLinkUse = linkUseService.createLinkUse(linkUse);
        return new ResponseEntity<>(createdLinkUse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteLinkUse(@PathVariable final String id) {
        linkUseService.deleteLinkUse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<LinkUseDto> updateLinkUse(@PathVariable final String id, @RequestBody final LinkUseDto linkUse) {
        LinkUseDto createdLinkUse = linkUseService.updateLinkUse(id, linkUse);
        return new ResponseEntity<>(createdLinkUse, HttpStatus.OK);
    }
}
