package com.theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.dto.NodeFieldDto;
import com.theuniversalgraph.api.rest.entity.NodeFieldEntity;
import com.theuniversalgraph.model.*;

@Service
public class NodeFieldConverter extends AbstractConverter<NodeFieldEntity, NodeFieldDto> {

    @Override
    public void toDto(final NodeFieldEntity entity, final NodeFieldDto dto) {
        // convert NodeFieldEntity to NodeFieldDto

    }

    @Override
    public void fromDto(final NodeFieldEntity entity, final NodeFieldDto dto) {
        // convert NodeFieldDto to NodeFieldEntity
    }
}
