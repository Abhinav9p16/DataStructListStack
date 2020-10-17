package com.cg.linkedlist;

public class MyNode<K> implements INode<K> {
    private K key;
    private MyNode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;      // node consists of key and next
    }


    @Override
    public K getKey() { return key; }

    @Override
    public void setKey(K key) { this.key= key ;}

    @Override
    public INode<K> getNext() { return next; }

    @Override
    public void setNext(INode next) { this.next= (MyNode<K>) next; }

    @Override
    public String toString(){
        StringBuilder myStr = new StringBuilder();
        myStr.append(key);
        if (next != null) myStr.append("->").append(next);
        return myStr.toString();
    }
}

