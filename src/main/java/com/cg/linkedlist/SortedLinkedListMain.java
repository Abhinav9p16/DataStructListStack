package com.cg.linkedlist;
class SortedNode<T extends Comparable> {
    private T data;
    private SortedNode next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SortedNode getNext() {
        return next;
    }

    public void setNext(SortedNode next) {
        this.next = next;
    }

    public SortedNode(T data) {
        this.data=data;
        this.next=null;
    }
}
public class SortedLinkedListMain {
    public static void main(String[] args){
    SortedLinkedList sll = new SortedLinkedList();
    sll.add(30);
    sll.add(15);
    sll.add(45);
    sll.add(16);
    sll.printLinkedList();
}
}class SortedLinkedList<T extends Comparable> {
    SortedNode head = null;
    SortedNode tail = null;

    public void add(T d) {
        SortedNode node = new SortedNode(d);
        if (tail == null) {
            tail = node;
        }
        if (head == null) {
            head = node;
        } else {
            SortedNode temp = head;
            while(temp !=null){
                if(head.getNext()!=null){
                    if(temp.getNext()==null){
                        temp.setNext(node);
                        tail=temp.getNext();
                        break;
                    }
                    if(d.compareTo(temp.getData())>=0 && d.compareTo(temp.getNext().getData())<=0){
                        node.setNext(temp.getNext());
                        temp.setNext(node);
                        break;
                    }

                }
                else{
                    if(d.compareTo(head.getData())>0){
                        node.setNext(temp.getNext());
                        temp.setNext(node);
                        tail.setNext(temp);
                        break;
                    }
                    else{
                        head=node;
                        head.setNext(temp);

                        break;
                    }
                }
                temp=temp.getNext();
            }
        }
    }

    public void printLinkedList(){
        SortedNode node = head;
        while (node != null) {
            System.out.print(node.getData());
            if (node != tail) {
                System.out.print(" -> ");
            }
            node = node.getNext();
        }
    }
}


