package com.study.linkedList;

/**
 * �Զ���˫������ʵ�ֶ���
 * �Ƚ��ȳ�
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
