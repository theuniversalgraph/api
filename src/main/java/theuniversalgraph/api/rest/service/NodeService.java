package theuniversalgraph.api.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theuniversalgraph.api.rest.entity.NodeEntity;
import theuniversalgraph.api.rest.repository.NodeRepository;

import java.util.List;

@Service
public class NodeService {

    @Autowired
    private NodeRepository nodeRepository;

    public List<NodeEntity> getAllNodes(){
        return nodeRepository.findAll();
    }

    public NodeEntity getNode(final String id){
        return nodeRepository.findOne(id);
    }

    public NodeEntity createNode(NodeEntity nodeEntity){
        return nodeRepository.save(nodeEntity);
    }

    public NodeEntity updateNode(String id, NodeEntity nodeEntity){
        nodeRepository.delete(id);
        return nodeRepository.save(nodeEntity);
    }

    public void deleteNode(String id){
        nodeRepository.delete(id);
    }

}
