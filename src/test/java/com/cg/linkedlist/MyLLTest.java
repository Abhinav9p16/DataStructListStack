package com.cg.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLLTest {
    @Test
    public void given3nosShdBeAddedTop() {
        MyNode<Integer> myFNode = new MyNode<>(70);
        MyNode<Integer> mySNode = new MyNode<>(30);
        MyNode<Integer> myTNode = new MyNode<>(56);
        MyLinkedList myLL = new MyLinkedList();
        myLL.add(myFNode);
        myLL.add(mySNode);
        myLL.add(myTNode);
        myLL.printMyNodes();
        boolean result = myLL.head.equals(myTNode) && myLL.head.getNext().equals(mySNode) && myLL.tail.equals(myFNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3nosAppendedShdBeAddedLast() {
        MyNode<Integer> myTNode = new MyNode<>(70);
        MyNode<Integer> mySNode = new MyNode<>(30);
        MyNode<Integer> myFNode = new MyNode<>(56);
        MyLinkedList myLL = new MyLinkedList();
        myLL.add(myFNode);
        myLL.append(mySNode);
        myLL.append(myTNode);
        myLL.printMyNodes();
        boolean result = myLL.head.equals(myFNode) && myLL.head.getNext().equals(mySNode) && myLL.tail.equals(myTNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3nosInsertShdBeAddedBw() {
        MyNode<Integer> myTNode = new MyNode<>(70);
        MyNode<Integer> mySNode = new MyNode<>(30);
        MyNode<Integer> myFNode = new MyNode<>(56);
        MyLinkedList myLL = new MyLinkedList();
        myLL.add(myFNode);
        myLL.append(myTNode);
        myLL.insert(myFNode,mySNode);
        myLL.printMyNodes();
        boolean result = myLL.head.equals(myFNode) && myLL.head.getNext().equals(mySNode) && myLL.tail.equals(myTNode);
        Assert.assertTrue(result);
    }
}

