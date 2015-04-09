package theuniversalgraph.api.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class NodeDto {

    public NodeDto() {
        this.children = new ArrayList<>();
        this.parents = new ArrayList<>();
    }

    @JsonProperty("id")
    public String id;

    @JsonProperty("contenttype")
    public String contenttype;

    @JsonProperty("content")
    public String content;

    @JsonProperty("children")
    private List<NodeDto> children;

    @JsonProperty("parents")
    private List<NodeDto> parents;

    @JsonProperty("x")
    private int x;

    @JsonProperty("y")
    private int y;

    @JsonProperty("width")
    private int width;

    @JsonProperty("height")
    private int height;

    public String getId() {
        return id;
    }

    public String getContenttype() {
        return contenttype;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<NodeDto> getChildren() {
        return children;
    }

    public void setChildren(List<NodeDto> children) {
        this.children = children;
    }

    public List<NodeDto> getParents() {
        return parents;
    }

    public void setParents(List<NodeDto> parents) {
        this.parents = parents;
    }
}
