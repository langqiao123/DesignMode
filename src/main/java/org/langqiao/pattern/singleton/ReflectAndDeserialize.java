package org.langqiao.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 单例模式,反射和反序列化漏洞
 * @author mingyangyang
 *
 */
public class ReflectAndDeserialize {
	
	public static void main(String[] args) {
		try {
			//reflectLoopheap();
			deserializeLoopheap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//单例模式，反射漏洞
	public static void reflectLoopheap() throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		//通过反射直接调用私有构造器
		Class<SingletonDemo6> cl = (Class<SingletonDemo6>) Class.forName("org.langqiao.pattern.singleton.SingletonDemo6");
		Constructor<SingletonDemo6> constructor = cl.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		System.out.println(constructor.newInstance());
		System.out.println(constructor.newInstance());
	}
	
	//单例模式，反序列化漏洞
	public static void deserializeLoopheap() throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		//通过反序列化的方式构造多个对象 
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo6 s3 =  (SingletonDemo6) ois.readObject();
		System.out.println(s3);
	}
}
