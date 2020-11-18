# String相关

## Q1:拼接字符串方法及比较

1. +：语法糖，基于StringBuilder实现
2. concat：新建Char数组，返回一个新的字符串。
3. StringBuilder：效率最高，并发不安全
4. StringBuffer：效率次于Builder，并发安全。