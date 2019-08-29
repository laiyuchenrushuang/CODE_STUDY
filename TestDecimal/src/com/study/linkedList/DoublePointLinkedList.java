package com.study.linkedList;

/**
 * ˫������
 * 
 * @author hdy
 *
 */
public class DoublePointLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublePointLinkedList() {
        super();
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object value) {
            this.data = value;
        }
    }

    // ����ͷ�����ڵ�
    public int addHead(Object value) {
        Node obj = new Node(value);
        // �ж��Ƿ���δ��ʼ�������� ���Ϊ����ͷ��β�����Ǹ������ڵ�
        if (size == 0) {
            head = obj;
            tail = obj;
        } else {
            obj.next = head;
            head = obj;
        }
        size++;
        return size;
    }

    // β�������ڵ�
    public int addTail(Object value) {
        Node obj = new Node(value);
        // �ж��Ƿ���δ��ʼ�������� ���Ϊ����ͷ��β�����Ǹ������ڵ�
        if (size == 0) {
            head = obj;
            tail = obj;
        } else {
            tail.next = obj;
            tail = obj;
        }
        size++;
        return size;
    }

    // �ж��Ƿ�Ϊ��
    public boolean isEmpty() {
        return size == 0;
    }

    // ��ȡ����Ľڵ����
    public int getSize() {
        return size;
    }

    // ��ʾ�ڵ���Ϣ
    public void display() {
        Node tempHead = this.head;
        Node tempTail = this.tail;
        int size = this.size;
        if (size > 0) {
            System.out.print("[");
            while (!tempHead.data.equals(tempTail.data)) {
                System.out.print(tempHead.data + "->");
                tempHead = tempHead.next;
            }
            System.out.print(tempHead.data);
            System.out.print("]");
            System.out.println();
        } else {
            System.out.println("[]");
        }
    }

    // ɾ���ڵ���Ϣ
    public Object removeHead() {
        if (size == 0) {
            return null;
        }
        Object data = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return data;
    }
}
