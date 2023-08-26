# 简单工厂模式

## 优点
1.实现创建对象的解耦（高内聚低耦合）
  A对象代码中如果要调用B对象，最简单的做法就是直接new一个B出来。
  这么做有一个问题，假如C类和B类实现了同一个接口/继承自同一个类，系统需要把B类修改成C类，程序不得不重写A类代码。
  如果程序中有100个地方new了B对象，那么就要修改100处。
2.通过工厂类，外界不需要直接创建具体产品对象，只需要负责消费，不需要关心内部如何创建对象
3.简单优化了软件体系结构，明确了各自功能模块的职责和权利

## 缺点
1.需要额外创建工厂类
2.违反开闭原则，如果接口新增了一个实现类，则需要修改工厂方法。为了解决这个弊端，后来出现了"工厂方法模式"；

## 使用场景：
1.如果某个接口下有多个实现类，则建议使用工厂方法替代new的方式创建实现类对象。

## 实际应用
1.线程池
JDK中的简单工厂模式有很多应用，比较典型的比如线程池。
我们使用线程池的时候，可以使用ThreadPoolExecutor，根据自己的喜好传入corePoolSize、maximumPoolSize、
keepAliveTimem、unit、workQueue、threadFactory、handler这几个参数，new出一个指定的ThreadPoolExecutor出来。

JDK给开发者提供了Executors这个类，可以让用户产生ThreadPoolExecutor和使用ThreadPoolExecutor分离开，
比如可以让Executors提供一个单线程的线程池Executors.newSingleThreadExecutor()、让Executors提供一个无界线程池Executors.newCachedThreadPool()等，
这样，开发者可以不用关心线程池是如何去实现的，直接使用Executors方法提供给开发者的ThreadPoolExecutor就可以了。