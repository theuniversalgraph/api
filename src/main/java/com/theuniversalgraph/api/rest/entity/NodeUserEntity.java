package com.theuniversalgraph.api.rest.entity;

import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import com.theuniversalgraph.model.*;

@Entity
@Table(name = "NodeUsers")
public class NodeUserEntity extends NodeUser {

    public NodeUserEntity() {}

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    public String getId() {
        return id;
    }
}
