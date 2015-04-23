package com.theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.dto.NodeDto;
import com.theuniversalgraph.api.rest.entity.NodeEntity;
import com.theuniversalgraph.model.*;

@Service
public class NodeConverter extends AbstractConverter<NodeEntity, NodeDto> {

    @Override
    public void toDto(final NodeEntity entity, final NodeDto dto) {
        // convert NodeEntity to NodeDto

    }

    @Override
    public void fromDto(final NodeEntity entity, final NodeDto dto) {
        // convert NodeDto to NodeEntity
    }
}
