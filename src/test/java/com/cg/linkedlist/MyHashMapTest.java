package com.cg.linkedlist;

import org.junit.*;

public class MyHashMapTest {
    @Test
    public void givenASentenceShdReturnWordFreq() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        Assert.assertEquals(2, frequency);
    }

    @Test
    public void givenString_whenParsed_shouldReturnParanoidFrequency() {
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyHashTable<String, Integer> hashtable = new MyHashTable<>();
        String[] words = str.toLowerCase().split(" ");
        for (String s : words) {
            Integer value = hashtable.get(s);
            if (value == null)
                value = 1;
            else
                value++;
            hashtable.add(s, value);
        }
        int frequency = hashtable.get("paranoid");
        Assert.assertEquals(3, frequency);
    }
}


