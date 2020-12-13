package ch.yuhang.templates.quizzes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {
    Queue<Integer> history;
    Map<Integer, Integer> data;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.history = new LinkedList<>();
        this.data = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (this.data.containsKey(key)) {
            this.history.remove(key);
            this.history.offer(key);
        }
        return this.data.get(key) != null ? this.data.get(key) : -1;
    }

    public void put(int key, int value) {
        while (this.data.size() >= this.capacity) {
            Integer oldestKey = this.history.poll();
            this.data.remove(oldestKey);
        }
        this.history.offer(key);
        if (this.data.containsKey(key)) {
            this.history.remove(key);
            this.history.offer(key);
        }
        this.data.put(key, value);


    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2, 2);
        lruCache.get(1);
        lruCache.put(3,3);
        System.out.println(lruCache.get(1));
    }
}
