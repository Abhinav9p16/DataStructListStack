package com.cg.linkedlist;

public class MyQueue<T> {
    private final MyLinkedList myQueue;

    public MyQueue(){
        this.myQueue = new MyLinkedList();
    }
    public void enqueue(T key){
        myQueue.append(new MyNode(key));
    }
    public T dequeue(){
        return (T) myQueue.pop().getKey();

    }
    public void printQueue(){
        myQueue.printMyNodes();
    }
}
