package com.codewithata.weekfour;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, Integer> items;

    public LRUCache(int capacity) {
        items = new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldestEntry) {
                return size() > capacity;
            }
        };

    }

    public int get(int key) {
        return items.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        items.put(key, value);
    }
}
