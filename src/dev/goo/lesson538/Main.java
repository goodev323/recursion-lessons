package dev.goo.lesson538;

import java.util.HashMap;

class Node {
    public Runnable data;
    public Node next = null;

    public Node(Runnable data) {
        this.data = data;
    }
}

class Queue {
    Node head = null;
    Node tail = null;

    public Queue() {
    }

    public Runnable peekFront() {
        if (this.head == null) return null;
        else return this.head.data;
    }

    public Runnable peekBack() {
        if (this.tail == null) return null;
        else return this.tail.data;
    }

    public void enqueue(Runnable data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else if (this.tail == null) {
            this.tail = new Node(data);
            this.head.next = this.tail;
        } else {
            this.tail.next = new Node(data);
            this.tail = this.tail.next;
        }
    }

    public Runnable dequeue() {
        if (this.head == null) return null;
        Node temp = this.head;
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        return temp.data;
    }
}

class EventQueue {
    public HashMap<String, Queue> queue;

    public EventQueue() {
        this.queue = new HashMap<>();
    }

    public void push(String event, Runnable callback) {
        if (this.taskExists(event)) {
            this.queue.get(event).enqueue(callback);
        } else {
            this.queue.put(event, new Queue());
            this.queue.get(event).enqueue(callback);
        }
    }

    public boolean taskExists(String event) {
        return this.queue.get(event) != null && this.queue.get(event).peekFront() != null;
    }

    public void run(String event) {
        if (this.taskExists(event)) {
            this.queue.get(event).peekFront().run();
        }
    }

    public void dispatch(String event) {
        if (this.taskExists(event)) {
            this.queue.get(event).dequeue().run();
        } else {
            System.out.println("Event is none!");
        }
    }

    public String toString() {
        String str = "";
        for(String event: this.queue.keySet()) {
            str += event + ":" + this.queue.get(event) + "";
        }
        return str;
    }
}