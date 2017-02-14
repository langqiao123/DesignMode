package org.langqiao.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例模式-反射漏洞的解决方案
 * @author mingyangyang
 *
 */
public class SingletonDemo6 implements Serializable{
	private static SingletonDemo6 instance;
	
	private SingletonDemo6(){
		if(instance != null){
			throw new RuntimeException();
		}
	}
	
	public synchronized static SingletonDemo6 getInstance(){
		if(instance == null){
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
	/**
	 * 现在通过可序列化的工具，我们可以将一个单例的实例对象写到磁盘，然后再读回来，从而有效地获得一个实例。即使构造函数是私有的，
	 * 可序列化工具依然可以通过特殊的途径去创建类的一个新的实例。序列化操作提供了一个很特别的钩子（hook）-类中具有一个私有的被实例化的方法readresolve(),
	 * 这个方法可以确保类的开发人员在序列化将会返回怎样的object上具有发言权。足够奇怪的，readresolve()并不是静态的，但是在序列化创建实例的时候被引用。
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
