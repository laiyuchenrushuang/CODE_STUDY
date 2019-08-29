package com.study.linkedList;

public class OrderLinkedList {
    private Node node;

    private class Node {
        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
        }
    }

    public OrderLinkedList() {
        super();
        this.node = null;
    }

    // ����ڵ㣬���մ�С�����˳��
    public void insert(int value) {
        Node temp = new Node(value);
        Node current = node;
        Node pre = null;
        while (current != null && value > current.data) {
            pre = current;
            current = current.next;
        }
        if (pre == null) {
            node = temp;
            node.next = current;
        } else {
            pre.next = temp;
            temp.next = current;
        }
    }

    // ���
    public void display() {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
