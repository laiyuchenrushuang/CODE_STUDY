package com.study.linkedList;

public class MainTest {

    public static void main(String[] args) {
        /*DoublePointLinkedList db = new DoublePointLinkedList();
        db.addHead("A");
        db.addHead("B");
        db.addHead("C");
        db.addTail("D");
        db.display();
        System.out.println(db.getSize());
        System.out.println(db.isEmpty());
        System.out.println(db.removeHead());
        db.display();*/
        orderListTest();
    }
    
    public static void queueTest() {
        QueueLinkedList q = new QueueLinkedList();
        q.display();
        System.out.println(q.getSize());
        q.insert("A");
        System.out.println(q.getSize());
        q.insert("C");
        q.delete();
        q.display();
    }
    
    public static void orderListTest() {
        OrderLinkedList od = new OrderLinkedList();
        od.insert(2);
        od.insert(7);
        od.insert(9);
        od.insert(4);
        od.insert(1);
        od.display();
    }
}
