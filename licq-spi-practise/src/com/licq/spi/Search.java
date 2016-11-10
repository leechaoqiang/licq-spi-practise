package com.licq.spi;

import java.util.List;
/**
 * 
 * 很多开源的一些框架的一些服务发现和接入都采用了java的spi机制。
  所以简单的总结下java spi机制的思想。
 我们系统里抽象的各个模块，往往有很多不同的实现方案，比如日志模块的方案，xml解析模块、jdbc模块的方案等。
 面向的对象的设计里，我们一般推荐模块之间基于接口编程，模块之间不对实现类进行硬编码。
 一旦代码里涉及具体的实现类，就违反了可拔插的原则，如果需要替换一种实现，就需要修改代码。
 * 
 * */
public interface Search {
	 List<Object> search(String keyword);  
}
