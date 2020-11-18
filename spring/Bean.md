# Spring Bean

## Q1:Spring中Bean的作用域

早期版本中只有两个作用域：

- Singleton：单例模式，Spring IoC容器中只存在一个共享Bean实例，其作用域即Spring中的默认作用域。
- Prototype：每次通过Spring容器获取Prototype定义的Bean时，容器都会新建新的Bean实例，每个实例都有自己的属性和状态。

在Spring 2.X版本中新加入了：

- request：一次HTTP请求会返回该Bean的实例，不同的请求会创建新的Bean实例，仅在当面请求内生效，请求结束随之销毁。
- session：一次HTTP Session中容器返回同一个实例，不同的Session请求创建新的实例，仅在当前Session中有效。
- GlobalSession：指在一个全局HTTP Session中容器返回同一个Bean实例，仅在Portlet Context时有效。





## Q2:介绍一下Spring Bean的生命周期

//TODO

## Q3:介绍一下Spring Bean的装配流程

1. 读取Bean配置信息（XML，注解，配置类），构建Bean定义注册表
2. 根据Bean注册表实例化Bean
3. 将Bean实例载入Bean缓存池
4. Bean业务程序从缓存池获取Bean

## Q4:介绍一下自动装配的五种方式

Spring装配方法分为手动装配和自动装配。

手动装配包括XML装配（构造方法）、基于注解装配。

自动装配分为五种，用来引导Spring容器自动完成依赖注入。

1. no：关闭自动装配。
2. byName：通过参数名自动装配。
3. byType：通过参数类型自动装配。
4. constructor：通过设置构造器参数方式装配。
5. autodetect：首先尝试constructor来自动装配，无效后使用byType。