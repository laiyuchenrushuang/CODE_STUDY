package com.study;

import java.util.List;

public class TreeNode {
	private String id;
	
	private String parentId;
	
	private String name;
	
	private List<TreeNode> children;
	
	public TreeNode(String id, String name, String parentId) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", parentId=" + parentId + ", name=" + name + ", children=" + children + "]";
	}
	
}
