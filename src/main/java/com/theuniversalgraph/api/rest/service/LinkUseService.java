package com.theuniversalgraph.api.rest.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.converter.LinkUseConverter;
import com.theuniversalgraph.api.rest.dto.LinkUseDto;
import com.theuniversalgraph.api.rest.entity.LinkUseEntity;
import com.theuniversalgraph.api.rest.repository.LinkUseRepository;
import com.theuniversalgraph.model.*;

import java.util.List;

@Service
public class LinkUseService {

    @Autowired
    private LinkUseRepository linkUseRepository;

    @Autowired
    private LinkUseConverter linkUseConverter;

        public List<LinkUseDto> getAllLinkUses(){
        return linkUseConverter.toDto(linkUseRepository.findAll());
    }

    public LinkUseDto getLinkUse(final String id){
        return linkUseConverter.toDto(linkUseRepository.findOne(id));
    }

    public LinkUseDto createLinkUse(LinkUseDto linkUseDto){
        LinkUseEntity linkUseEntity = linkUseConverter.fromDto(linkUseDto);
        return linkUseConverter.toDto(linkUseRepository.save(linkUseEntity));
    }

    public LinkUseDto updateLinkUse(String id, LinkUseDto linkUseDto){
        linkUseRepository.delete(id);
        LinkUseEntity linkUseEntity = linkUseConverter.fromDto(linkUseDto);
        return linkUseConverter.toDto(linkUseRepository.save(linkUseEntity));
    }

    public void deleteLinkUse(String id){
        linkUseRepository.delete(id);
    }
}
