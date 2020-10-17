package com.cg.linkedlist;

public class MySortedLinkedList<T> {
    public INode tail;
    public INode head;

    public MySortedLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode temp = this.head;
            if (head != tail) {
                if(temp.compareTo(newNode)==1){
                    newNode.setNext(temp);
                    head=newNode;
                } else {
                    while (temp.getNext() != null && temp.getNext().compareTo(newNode) == -1) {
                        temp = temp.getNext();
                    }
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                }
            } else {
                if (head.compareTo(newNode) == -1) tail = newNode;
                else head = newNode;
                head.setNext(tail);
            }
        }
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public boolean search(INode myNode) {
        INode temp = head;
        while (temp != null) {
            if (temp.getKey() == myNode.getKey()) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public boolean delete(INode myNode) {
        if (!search(myNode)) return false;
        INode tempNode = head;
        while (tempNode.getNext().getKey() != myNode.getKey()) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        ;
        return true;
    }

    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }
}
