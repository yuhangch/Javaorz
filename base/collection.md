# Java 集合

## Q1:说说Java常见的集合吧

Map接口和Collection接口是所有集合框架的父接口。

Java中集合分为四种List、Queue、Set和Map。

- List（可重复）
	
	1. ArrayList：基于数组，增删慢，查询快，线程不安全
	
  2. Vector：基于数组实现，增删慢，查询快，***线程安全***
  
  3. LinkedList：基于双向链表，增删快，查询慢，线程不安全

- Set（不可重复）
- //TODO

## Q2:HashMap内部结构和实现

HashMap的内部是一个数组，数组中每个元素都是一个单向链表，链表中每个元素都是嵌套的Entry实例。ENtry实例包含四个属性：Key、Value、Hash值和指向下个元素的next。

为了减小遍历开销，Java 8对HashMap进行了优化，在保存元素超过8个以后，HashMap将链表转换为红黑树。



## Q3:说说ConcurrentHashMap实现并发的原理

减小锁的粒度

在HashMap中，如果为了线程安全对整个HashMap加锁，可以得到线程安全的对象，但加锁力度太大，降低效率。在ConcurrentHashMap内部使用数据段（Segment）的方式，在修改数据时只需对其中一个数据段加锁，减小了锁的粒度。

在ConcurrentHashMap包含多个Segment数组，Segment继承可重入锁（ReentrantLock），扮演锁的角色，与HashMap类似，是数组和链表结构。每个Segment里包含一个HashEntry数组，用于键值对数据的存储，在对HashEntry数组数据进行修改时，必须先获取它对应的Segment锁。

