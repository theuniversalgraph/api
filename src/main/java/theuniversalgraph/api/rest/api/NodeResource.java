package theuniversalgraph.api.rest.api;

import com.wordnik.swagger.annotations.Api;
import enclosing.application.node.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import theuniversalgraph.api.rest.entity.NodeEntity;
import theuniversalgraph.api.rest.service.NodeService;

import java.util.List;

@RestController
@RequestMapping("/v1")
@Api(value = "Node API")
public class NodeResource {

    @Autowired
    private NodeService nodeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<NodeEntity> getAllNodes() {
        return nodeService.getAllNodes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Node getNode(@PathVariable final String id) {
        return nodeService.getNode(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<NodeEntity> addNode(@RequestBody final NodeEntity node) {
        NodeEntity createdNode = nodeService.createNode(node);
        return new ResponseEntity<>(createdNode, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteNode(@PathVariable final String id) {
        nodeService.deleteNode(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<NodeEntity> updateNode(@PathVariable final String id, @RequestBody final NodeEntity node) {
        NodeEntity createdNode = nodeService.updateNode(id, node);
        return new ResponseEntity<>(createdNode, HttpStatus.OK);
    }

}

