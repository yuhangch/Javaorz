# Java 集合

## Q1:说说Java常见的集合吧

Map接口和Collection接口是所有集合框架的父接口。

Java中集合分为四种List、Queue、Set和Map。

- List（可重复）
	
	1. ArrayList：基于数组，增删慢，查询快，线程不安全
	
  2. Vector：基于数组实现，增删慢，查询快，***线程安全***
  
  3. LinkedList：基于双向链表，增删快，查询慢，线程不安全

- Set（不可重复）