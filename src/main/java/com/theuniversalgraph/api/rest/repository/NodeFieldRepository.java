package com.theuniversalgraph.api.rest.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.theuniversalgraph.api.rest.entity.NodeFieldEntity;
import com.theuniversalgraph.model.*;

@Repository
public interface NodeFieldRepository extends JpaRepository<NodeFieldEntity, String> {

}