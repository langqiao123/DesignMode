package org.langqiao.pattern.singleton;

/**
 * 单例双重检测锁模式
 * @author mingyangyang
 *
 */
public class SingletonDemo4 {
	
	private static SingletonDemo4 instance;
	
	private SingletonDemo4(){
		
	}
	
	public static SingletonDemo4 getInstance(){
		if(instance == null){
			synchronized(SingletonDemo4.class){
				if(instance == null){
					synchronized(SingletonDemo4.class){
						if(instance == null){
							instance = new SingletonDemo4();
						}
					}
				}
			}
		}
		return instance;
	}
}
