package theuniversalgraph.api.rest.entity;


import enclosing.application.node.Node;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "nodes")
public class NodeEntity extends Node {

    public NodeEntity() {
        super("", "", "");
    }

    public NodeEntity(String id, String content, String contenttype) {
        super(id, content, contenttype);
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    public String getId() {
        return id;
    }

    @Column(name = "contenttype")
    public String getContentType()
    {
        return contenttype;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    /*
    public void setId(String str) {
        id = str;
    }

    public void setContent(String str) {
        content = str;
    }

    @Column(name = "childlen")
    public Vector getChildren()
    {
        return childlen;
    }

    public void setChildren(Vector hash)
    {
        childlen = hash;
    }

    @Column(name = "parents")
    public Vector getParents() {
        return parents;
    }

    public void setParents(Vector hash) {
        parents = hash;
    }

    public void setContentType(String str)
    {
        contenttype = str;
    }
    */

}
