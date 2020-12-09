package ch.yuhang.templates.concurrency;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TL {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        lock.lock();
        ThreadPoolExecutor t = new ScheduledThreadPoolExecutor(4);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            t.submit(() -> System.out.println("hello"));
        }
    }
}
