package com.cg.linkedlist;

public class LinkedListMap<K,V> {
   private INodeMap head ;
   private INodeMap tail ;

   public LinkedListMap() {
           this.head = null;
           this.tail= null;
   }

   public void append(INodeMap myNode) {
           if(this.head==null) this.head= myNode;
           if(this.tail==null) this.tail= myNode;
           else {this.tail.setNext(myNode);
           }
   }
   public INodeMap<K,V> search(K key){
       INodeMap temp = head;
       while (temp != null) {
           if (temp.getKey().equals(key)) {
               return temp;
           }
           temp = temp.getNext();
       }
       return null;
   }
   public void delete(K key){
       INodeMap tempNode = head;
       while (tempNode!=null){
           if(head.getKey().equals(key)){
               if(head.getNext()==null){
                   head=null;
                   tail=null;
                   break;
               }
               else{
                   head=head.getNext();
                   break;
               }
           }if(tempNode.getNext().getKey().equals(key)){
               tempNode.setNext(tempNode.getNext().getNext());
           }tail=tempNode;
           tempNode=tempNode.getNext();
       }
   }
   public void printMapNodes(){System.out.println("My Nodes: " + head); }

}
