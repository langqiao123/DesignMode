package org.langqiao.pattern.singleton;

/**
 * 单例枚举类模式
 * (没有延时加载)
 * @author mingyangyang
 *
 */
public enum SingletonDemo5 {
	//这个枚举元素，本身就是单例对象！
	instance;
	
	public void singleOperation(){
		
	}
}
