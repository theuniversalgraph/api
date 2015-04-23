package com.theuniversalgraph.api.rest.converter;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.dto.NodeUserDto;
import com.theuniversalgraph.api.rest.entity.NodeUserEntity;
import com.theuniversalgraph.model.*;

@Service
public class NodeUserConverter extends AbstractConverter<NodeUserEntity, NodeUserDto> {

    @Override
    public void toDto(final NodeUserEntity entity, final NodeUserDto dto) {
        // convert NodeUserEntity to NodeUserDto

    }

    @Override
    public void fromDto(final NodeUserEntity entity, final NodeUserDto dto) {
        // convert NodeUserDto to NodeUserEntity
    }
}
