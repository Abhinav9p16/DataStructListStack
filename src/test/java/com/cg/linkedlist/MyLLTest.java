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
}
