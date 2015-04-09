package theuniversalgraph.api.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theuniversalgraph.api.rest.converter.NodeConverter;
import theuniversalgraph.api.rest.dto.NodeDto;
import theuniversalgraph.api.rest.entity.NodeEntity;
import theuniversalgraph.api.rest.repository.NodeRepository;

import java.util.List;

@Service
public class NodeService {

    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private NodeConverter nodeConverter;

    public List<NodeDto> getAllNodes(){
        return nodeConverter.toDto(nodeRepository.findAll());
    }

    public NodeDto getNode(final String id){
        return nodeConverter.toDto(nodeRepository.findOne(id));
    }

    public NodeDto createNode(NodeDto nodeDto){
        NodeEntity nodeEntity = nodeConverter.fromDto(nodeDto);
        return nodeConverter.toDto(nodeRepository.save(nodeEntity));
    }

    public NodeDto updateNode(String id, NodeDto nodeDto){
        nodeRepository.delete(id);
        NodeEntity nodeEntity = nodeConverter.fromDto(nodeDto);
        return nodeConverter.toDto(nodeRepository.save(nodeEntity));
    }

    public void deleteNode(String id){
        nodeRepository.delete(id);
    }

}
