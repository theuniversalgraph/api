package com.theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.dto.LinkUseDto;
import com.theuniversalgraph.api.rest.entity.LinkUseEntity;
import com.theuniversalgraph.model.*;

@Service
public class LinkUseConverter extends AbstractConverter<LinkUseEntity, LinkUseDto> {

    @Override
    public void toDto(final LinkUseEntity entity, final LinkUseDto dto) {
        // convert LinkUseEntity to LinkUseDto

    }

    @Override
    public void fromDto(final LinkUseEntity entity, final LinkUseDto dto) {
        // convert LinkUseDto to LinkUseEntity
    }
}
