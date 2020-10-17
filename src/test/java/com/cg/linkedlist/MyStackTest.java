package com.cg.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3nosStackBeAddedTop(){
        MyNode<Integer> myFNode = new MyNode<>(70);
        MyNode<Integer> mySNode = new MyNode<>(30);
        MyNode<Integer> myTNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFNode);
        myStack.push(mySNode);
        myStack.push(myTNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myTNode,peak);
    }
    @Test
    public void given3nosStackBeAddedPop(){
        MyNode<Integer> myFNode = new MyNode<>(70);
        MyNode<Integer> mySNode = new MyNode<>(30);
        MyNode<Integer> myTNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFNode);
        myStack.push(mySNode);
        myStack.push(myTNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myTNode,pop);

    }
}
