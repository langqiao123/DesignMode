package org.langqiao.pattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种创建单例模式的效率
 *
 */
public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		/*long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
//						Object o = SingletonDemo4.getInstance();
						Object o = SingletonDemo5.instance;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		System.out.println("总耗时："+(end-start));*/
		test_badmash();
		test_lazy();
		test_static_inner_class();
		test_double_check();
		test_enum();
	}
	
	//测试恶汉单例模式
	public static void test_badmash() throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
						Object o = SingletonDemo1.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		System.out.println("恶汉总耗时："+(end-start));
	}
	
	//测试懒汉单例模式
	public static void test_lazy() throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
						Object o = SingletonDemo2.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		System.out.println("懒汉总耗时："+(end-start));
	}
	
	//测试懒汉单例模式
	public static void test_static_inner_class() throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
						Object o = SingletonDemo3.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		System.out.println("静态内部类总耗时："+(end-start));
	}
	
	//测试懒汉单例模式
	public static void test_double_check() throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
						Object o = SingletonDemo4.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		System.out.println("双重检测锁总耗时："+(end-start));
	}
	
	//测试懒汉单例模式
	public static void test_enum() throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
						Object o = SingletonDemo5.instance;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		System.out.println("枚举类总耗时："+(end-start));
	}
}
