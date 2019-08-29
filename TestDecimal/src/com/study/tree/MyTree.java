package com.study.tree;

public class MyTree {
    Node root;

    public MyTree() {
        this.root = null;
    }

    // �����ڵ�
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

    // ���ҽڵ�
    public Node find(int value) {
        Node current = root;
        while (current != null) {
            if (current.getData() > value) {
                // ������ڵ�
                current = current.getLeftNode();
            } else if (current.getData() < value) {
                // �����ҽڵ�
                current = current.getRightNode();
            } else {
                return current;
            }
        }
        return null;
    }

    // �������
    public void idfixOrder(Node node) {
        if (node != null) {
            idfixOrder(node.getLeftNode());
            System.out.println(node.getData());
            idfixOrder(node.getRightNode());
        }
    }

    // ǰ�����
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
    }

    // �������
    public void lastOrder(Node node) {
        if (node != null) {
            lastOrder(node.getLeftNode());
            lastOrder(node.getRightNode());
            System.out.println(node.getData());
        }
    }
    
    
}
