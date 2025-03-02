# RPC 框架
## 项目介绍
基于 Java + Etcd + Vert.x + 自定义协议实现。开发者可以引入 Spring Boot Starter , 通过注解和配置文件快速使用框架,像调用本地方法一样轻松调用远程服务;还支持通过SPI机制动态扩展序列化器、负载均衡器、重试和容错策略等。

## 本项目整体调用流程
![](https://cdn.nlark.com/yuque/0/2025/png/47747359/1740916689614-929eb9f6-a641-45c6-bca2-4da79f8ddffc.png)

## 技术选型
+ Vert.x 框架
+ Etcd 云原生存储中间件（jetcd 客户端）
+ SPI 机制
+ 多种序列化器(JSON 序列化、Kryo 序列化、Hessian 序列化)
+ 多种设计模式(双检锁单例模式、工厂模式、代理模式、装饰者模式)
+ Spring Boot Starter 开发
+ 反射和注解驱动
+ Guava Retrying 重试库
+ JUnit 单元测试
+ Logback 日志库

## 源码目录
+ rpc-easy：RPC 框架简易版
+ example-consumer：服务消费者
+ example-provider：服务提供者
+ rpc-core：RPC 框架核心代码
+ example-common：公用模块
+ example-springboot-consumer：服务消费者（Spring Boot 框架）
+ example-springboot-provider：服务提供者（Spring Boot 框架）
+ rpc-spring-boot-starter：注解驱动的 RPC 框架，可在 Spring Boot 项目中快速使用

