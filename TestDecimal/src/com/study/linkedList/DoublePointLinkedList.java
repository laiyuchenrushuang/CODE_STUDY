package com.study.linkedList;

/**
 * 双端链表
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

    // 链表头新增节点
    public int addHead(Object value) {
        Node obj = new Node(value);
        // 判断是否是未初始化的链表 如果为空则头部尾部都是该新增节点
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

    // 尾部新增节点
    public int addTail(Object value) {
        Node obj = new Node(value);
        // 判断是否是未初始化的链表 如果为空则头部尾部都是该新增节点
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

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 获取链表的节点个数
    public int getSize() {
        return size;
    }

    // 显示节点信息
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

    // 删除节点信息
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
