package com.theuniversalgraph.api.rest.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.theuniversalgraph.api.rest.converter.NodeFieldConverter;
import com.theuniversalgraph.api.rest.dto.NodeFieldDto;
import com.theuniversalgraph.api.rest.entity.NodeFieldEntity;
import com.theuniversalgraph.api.rest.repository.NodeFieldRepository;
import com.theuniversalgraph.model.*;

import java.util.List;

@Service
public class NodeFieldService {

    @Autowired
    private NodeFieldRepository nodeFieldRepository;

    @Autowired
    private NodeFieldConverter nodeFieldConverter;

        public List<NodeFieldDto> getAllNodeFields(){
        return nodeFieldConverter.toDto(nodeFieldRepository.findAll());
    }

    public NodeFieldDto getNodeField(final String id){
        return nodeFieldConverter.toDto(nodeFieldRepository.findOne(id));
    }

    public NodeFieldDto createNodeField(NodeFieldDto nodeFieldDto){
        NodeFieldEntity nodeFieldEntity = nodeFieldConverter.fromDto(nodeFieldDto);
        return nodeFieldConverter.toDto(nodeFieldRepository.save(nodeFieldEntity));
    }

    public NodeFieldDto updateNodeField(String id, NodeFieldDto nodeFieldDto){
        nodeFieldRepository.delete(id);
        NodeFieldEntity nodeFieldEntity = nodeFieldConverter.fromDto(nodeFieldDto);
        return nodeFieldConverter.toDto(nodeFieldRepository.save(nodeFieldEntity));
    }

    public void deleteNodeField(String id){
        nodeFieldRepository.delete(id);
    }
}
