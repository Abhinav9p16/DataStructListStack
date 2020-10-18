package com.cg.linkedlist;
import java.util.*;

public class MyHashTable<K,V> {
    private final int num_of_buckets;
    ArrayList<LinkedListMap> my_bucket_array;
    public MyHashTable(){
        this.num_of_buckets=10;
        this.my_bucket_array=new ArrayList<>(num_of_buckets);

        for(int i=0;i<10;i++){
            my_bucket_array.add(null);
        }
    }
    public V get(K key) {
        int index=this.getBucketIndex(key);
        LinkedListMap linkedList=this.my_bucket_array.get(index);
        if(linkedList==null)
            return null;
        MyMapNode<K,V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index=hashCode % num_of_buckets;
        return index;
    }


   public void add(K key, V value) {
        int index=this.getBucketIndex(key);
        LinkedListMap linkedList=this.my_bucket_array.get(index);
        if(linkedList == null){
            linkedList = new LinkedListMap();
            this.my_bucket_array.set(index,linkedList);
        }
        MyMapNode<K,V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
        if(mapNode==null){
            mapNode = new MyMapNode<>(key,value);
            linkedList.append(mapNode);
        }
        else
            mapNode.setValue(value);

    }

    public void remove(K key) {
        int index=this.getBucketIndex(key);
        LinkedListMap linkedList=this.my_bucket_array.get(index);
        linkedList.delete(key);
    }
}
