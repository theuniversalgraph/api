package com.theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.dto.LinkDto;
import com.theuniversalgraph.api.rest.entity.LinkEntity;
import com.theuniversalgraph.model.*;

@Service
public class LinkConverter extends AbstractConverter<LinkEntity, LinkDto> {

    @Override
    public void toDto(final LinkEntity entity, final LinkDto dto) {
        // convert LinkEntity to LinkDto

    }

    @Override
    public void fromDto(final LinkEntity entity, final LinkDto dto) {
        // convert LinkDto to LinkEntity
    	
    }
}
