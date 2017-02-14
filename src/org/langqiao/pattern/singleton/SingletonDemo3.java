package org.langqiao.pattern.singleton;

/**
 * 单例静态内部类模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载！
 * @author mingyangyang
 *
 */
public class SingletonDemo3 {
	
	private static class SingletonInstance{
		private static SingletonDemo3 instance = new SingletonDemo3();
	}
	
	private SingletonDemo3(){
		
	}
	
	//方法没有同步，调用效率高！
	public static SingletonDemo3 getInstance(){
		return SingletonInstance.instance;
	}
}
