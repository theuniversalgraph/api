// Decompiled by Jad v1.5.7d. Copyright 2000 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/SiliconValley/Bridge/8617/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NodeInterface.java

package enclosing.application.node;

import java.io.Serializable;
import java.util.Vector;

public interface NodeInterface
    extends Serializable
{

	/**
	 * 
	 * @uml.property name="id"
	 */
	public abstract String getId();

	/**
	 * 
	 * @uml.property name="id"
	 */
	public abstract void setId(String s);


    public abstract int getX();

    public abstract void setX(int i);

	/**
	 * 
	 * @uml.property name="content"
	 */
	public abstract String getContent();
	

	/**
	 * 
	 * @uml.property name="content"
	 */
	public abstract void setContent(String s);

	/**
	 * 
	 * @uml.property name="children"
	 */
	public abstract Vector getChildren();

	/**
	 * 
	 * @uml.property name="children"
	 */
	public abstract void setChildren(Vector vector);


    public abstract int getY();

    public abstract void setY(int i);

	/**
	 * 
	 * @uml.property name="parents"
	 */
	public abstract Vector getParents();

	/**
	 * 
	 * @uml.property name="parents"
	 */
	public abstract void setParents(Vector vector);


    public abstract int getHeight();

    public abstract void setHeight(int i);

	/**
	 * 
	 * @uml.property name="contentType"
	 */
	public abstract String getContentType();

	/**
	 * 
	 * @uml.property name="contentType"
	 */
	public abstract void setContentType(String s);

    public abstract int getWidth();

    public abstract void setWidth(int i);
}
