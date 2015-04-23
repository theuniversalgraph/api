package com.theuniversalgraph.api.rest.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.converter.NodeUserConverter;
import com.theuniversalgraph.api.rest.dto.NodeUserDto;
import com.theuniversalgraph.api.rest.entity.NodeUserEntity;
import com.theuniversalgraph.api.rest.repository.NodeUserRepository;
import com.theuniversalgraph.model.*;

import java.util.List;

@Service
public class NodeUserService {

    @Autowired
    private NodeUserRepository nodeUserRepository;

    @Autowired
    private NodeUserConverter nodeUserConverter;

        public List<NodeUserDto> getAllNodeUsers(){
        return nodeUserConverter.toDto(nodeUserRepository.findAll());
    }

    public NodeUserDto getNodeUser(final String id){
        return nodeUserConverter.toDto(nodeUserRepository.findOne(id));
    }

    public NodeUserDto createNodeUser(NodeUserDto nodeUserDto){
        NodeUserEntity nodeUserEntity = nodeUserConverter.fromDto(nodeUserDto);
        return nodeUserConverter.toDto(nodeUserRepository.save(nodeUserEntity));
    }

    public NodeUserDto updateNodeUser(String id, NodeUserDto nodeUserDto){
        nodeUserRepository.delete(id);
        NodeUserEntity nodeUserEntity = nodeUserConverter.fromDto(nodeUserDto);
        return nodeUserConverter.toDto(nodeUserRepository.save(nodeUserEntity));
    }

    public void deleteNodeUser(String id){
        nodeUserRepository.delete(id);
    }
}
