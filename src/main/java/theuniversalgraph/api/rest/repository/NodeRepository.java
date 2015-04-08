package theuniversalgraph.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import theuniversalgraph.api.rest.entity.NodeEntity;

@Repository
public interface NodeRepository extends JpaRepository<NodeEntity, String> {


}