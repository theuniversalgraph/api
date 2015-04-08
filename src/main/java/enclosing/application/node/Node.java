// Decompiled by Jad v1.5.7d. Copyright 2000 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/SiliconValley/Bridge/8617/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Node.java

package enclosing.application.node;

import java.io.Serializable;
import java.util.Vector;

// Referenced classes of package enclosing.application.node:
//            NodeInterface

public class Node
    implements NodeInterface,Serializable
{
	private static final long serialVersionUID = 8282646361946173266L;

	/**
	 * 
	 * @uml.property name="id"
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @uml.property name="id"
	 */
	public void setId(String str) {
		id = str;
	}

	/**
	 * 
	 * @uml.property name="x"
	 */
	public int getX() {
		return x;
	}

	/**
	 * 
	 * @uml.property name="x"
	 */
	public void setX(int i) {
		x = i;
	}

	/**
	 * 
	 * @uml.property name="content"
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 
	 * @uml.property name="content"
	 */
	public void setContent(String str) {
		content = str;
	}



    public Node(String id, String content, String contenttype)
    {
        this.id = id;
        this.setContent(content);
        if(this.content == null)
          this.content = "";
        this.contenttype = contenttype;
    }

    public Vector getChildren()
    {
        return childlen;
    }

    public void setChildren(Vector hash)
    {
        childlen = hash;
    }

	/**
	 * 
	 * @uml.property name="y"
	 */
	public int getY() {
		return y;
	}

	/**
	 * 
	 * @uml.property name="y"
	 */
	public void setY(int i) {
		y = i;
	}

	/**
	 * 
	 * @uml.property name="parents"
	 */
	public Vector getParents() {
		return parents;
	}

	/**
	 * 
	 * @uml.property name="parents"
	 */
	public void setParents(Vector hash) {
		parents = hash;
	}

	/**
	 * 
	 * @uml.property name="height"
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 
	 * @uml.property name="height"
	 */
	public void setHeight(int i) {
		height = i;
	}



    public String getContentType()
    {
        return contenttype;
    }

    public void setContentType(String str)
    {
        contenttype = str;
    }

	/**
	 * 
	 * @uml.property name="width"
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * 
	 * @uml.property name="width"
	 */
	public void setWidth(int i) {
		width = i;
	}

	/**
	 * 
	 * @uml.property name="x"
	 */
	private int x;

	/**
	 * 
	 * @uml.property name="y"
	 */
	private int y;

	/**
	 * 
	 * @uml.property name="width"
	 */
	private int width;

	/**
	 * 
	 * @uml.property name="height"
	 */
	private int height;

	/**
	 * 
	 * @uml.property name="id"
	 */
	public String id;

	/**
	 * 
	 * @uml.property name="content"
	 */
	public String content;

    public String contenttype;

	/**
	 * 
	 * @uml.property name="parents"
	 */
	public Vector parents = new Vector();

    public Vector childlen = new Vector();
}
