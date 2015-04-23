package com.theuniversalgraph.api.rest.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.converter.LinkConverter;
import com.theuniversalgraph.api.rest.dto.LinkDto;
import com.theuniversalgraph.api.rest.entity.LinkEntity;
import com.theuniversalgraph.api.rest.repository.LinkRepository;
import com.theuniversalgraph.model.*;

import java.util.List;

@Service
public class LinkService {

    @Autowired
    private LinkRepository linkRepository;

    @Autowired
    private LinkConverter linkConverter;

        public List<LinkDto> getAllLinks(){
        return linkConverter.toDto(linkRepository.findAll());
    }

    public LinkDto getLink(final String id){
        return linkConverter.toDto(linkRepository.findOne(id));
    }

    public LinkDto createLink(LinkDto linkDto){
        LinkEntity linkEntity = linkConverter.fromDto(linkDto);
        return linkConverter.toDto(linkRepository.save(linkEntity));
    }

    public LinkDto updateLink(String id, LinkDto linkDto){
        linkRepository.delete(id);
        LinkEntity linkEntity = linkConverter.fromDto(linkDto);
        return linkConverter.toDto(linkRepository.save(linkEntity));
    }

    public void deleteLink(String id){
        linkRepository.delete(id);
    }
}
