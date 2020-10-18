package com.cg.linkedlist;

public class MyMapNode<K, V> implements INodeMap<K,V> {
    K key;
    V value;
    MyMapNode<K,V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    public V getValue() {return  this.value;}
    public void setValue(V value){this.value=value;}

    @Override
    public INodeMap<K,V> getNext() {
        return next;
    }

    @Override
    public void setNext(INodeMap next) {
        this.next= (MyMapNode<K,V>) next;
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        myStr.append(key).append(value);
        if (next != null) myStr.append("->").append(next);
        return myStr.toString();
    }
    @Override
    public int compareTo(INodeMap m){
        if((int)this.key<(int)m.getKey()) return -1;
        else if((int)this.key>(int)m.getKey()) return 1;
        else return 0;
    }

}
