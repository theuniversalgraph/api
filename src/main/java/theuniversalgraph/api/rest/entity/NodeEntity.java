package theuniversalgraph.api.rest.entity;


import enclosing.application.node.Node;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@Entity
@Table(name = "nodes")
public class NodeEntity extends Node {

    public NodeEntity() {
        super("", "", "");
        this.childrenEntity = new ArrayList<>();
        this.parentsEntity = new ArrayList<>();
    }

    private List<NodeEntity> childrenEntity;
    private List<NodeEntity> parentsEntity;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    public String getId() {
        return id;
    }

    @Column(name = "contenttype")
    public String getContentType() {
        return contenttype;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    @Column(name = "x")
    public int getX() {
        return super.getX();
    }

    @Column(name = "y")
    public int getY() {
        return super.getY();
    }

    @Column(name = "height")
    public int getHeight() {
        return super.getHeight();
    }

    @Column(name = "width")
    public int getWidth() {
        return super.getWidth();
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE})
    @OrderColumn(name = "CHILDREN")
    public List<NodeEntity> getChildrenEntity() {
        return childrenEntity;
    }

    public void setChildrenEntity(List<NodeEntity> childrenEntity) {
        this.childrenEntity = childrenEntity;
    }

    @Transient
    @Override
    public Vector<NodeEntity> getChildren() {
        return new Vector<>(childrenEntity);
    }

    @Override
    public void setChildren(Vector hash) {
        childrenEntity = hash;
    }

    ///
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE})
    @OrderColumn(name = "PARENT")
    public List<NodeEntity> getParentsEntity() {
        return parentsEntity;
    }

    public void setParentsEntity(List<NodeEntity> parentsEntity) {
        this.parentsEntity = parentsEntity;
    }

    @Transient
    @Override
    public Vector<NodeEntity> getParents() {
        return new Vector<>(parentsEntity);
    }

    @Override
    public void setParents(Vector hash) {
        parentsEntity = hash;
    }

    @SuppressWarnings("unchecked")
    public void addChild(final NodeEntity child) {
        if (super.getChildren() == null)
            super.setChildren(new Vector<>());
        super.getChildren().add(child);
    }

}
