package ch.yuhang.templates.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class TL {
    private int age ;
    private String name;

    public TL(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
//        lock.lock();
//        ThreadPoolExecutor t = new ScheduledThreadPoolExecutor(4);
//        for (int i = 0; i < 10; i++) {0
//            System.out.println(i);
//            t.submit(() -> System.out.println("hello"));
//        }
        List<TL> list = new ArrayList<>();
        list.add(new TL(1, "一"));
        list.add(new TL(10, "十"));
        List<TL> ok = list.stream().filter(t -> t.age > 5).collect(Collectors.toList());
        System.out.println(ok.size());
    }
}
