package com.study.tree;

public class MyTree {
    Node root;

    public MyTree() {
        this.root = null;
    }

    // 新增节点
    public void add(int value) {
        Node node = new Node(value);
        if (this.root == null) {
            this.root = node;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                if (current.getData() > value) {
                    current = current.getLeftNode();
                    if (current == null) {
                        parentNode.setLeftNode(node);
                    }
                } else {
                    current = current.getRightNode();
                    if (current == null) {
                        parentNode.setRightNode(node);
                    }
                }
            }
        }
    }

    // 查找节点
    public Node find(int value) {
        Node current = root;
        while (current != null) {
            if (current.getData() > value) {
                // 查找左节点
                current = current.getLeftNode();
            } else if (current.getData() < value) {
                // 查找右节点
                current = current.getRightNode();
            } else {
                return current;
            }
        }
        return null;
    }

    // 中序遍历
    public void idfixOrder(Node node) {
        if (node != null) {
            idfixOrder(node.getLeftNode());
            System.out.println(node.getData());
            idfixOrder(node.getRightNode());
        }
    }

    // 前序遍历
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
    }

    // 后序遍历
    public void lastOrder(Node node) {
        if (node != null) {
            lastOrder(node.getLeftNode());
            lastOrder(node.getRightNode());
            System.out.println(node.getData());
        }
    }
    
    
}
