package com.cg.linkedlist;

public interface INodeMap<K, V> {
    K getKey();
    void setKey(K key);

    INodeMap getNext();
    void setNext(INodeMap next);

    int compareTo(INodeMap m);

}
