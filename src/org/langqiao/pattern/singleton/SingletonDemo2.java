package org.langqiao.pattern.singleton;

/**
 * 单例的懒汉模式
 * @author mingyangyang
 *
 */
public class SingletonDemo2 {
	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static SingletonDemo2 instance;
	
	//私有构造器
	private SingletonDemo2(){
		
	}
	
	//方法同步，调用效率低！
	public synchronized static SingletonDemo2 getInstance(){
		if(instance == null){
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
