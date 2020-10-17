package com.cg.linkedlist;

public class MyStack {
    private final MyLinkedList myLinkedlist;

    public MyStack(){
        this.myLinkedlist = new MyLinkedList();
    }
    public void push(INode myNode){
        myLinkedlist.add(myNode);
    }
    public INode peak(){
        return myLinkedlist.head;
    }
    public INode pop(){
        return myLinkedlist.pop();
    }
    public void printStack(){
        myLinkedlist.printMyNodes();
    }
}
