package com.study.linkedList;

/**
 * 自定义双端链表实现队列
 * 先进先出
 * @author hdy
 *
 */
public class QueueLinkedList {
    private DoublePointLinkedList dp;

    public QueueLinkedList() {
        dp = new DoublePointLinkedList();
    }

    public void insert(Object value) {
        dp.addTail(value);
    }

    public void delete() {
        dp.removeHead();
    }

    public boolean isEmpty() {
        return dp.isEmpty();
    }

    public int getSize() {
        return dp.getSize();
    }

    public void display() {
        dp.display();
    }
}
