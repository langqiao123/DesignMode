package org.langqiao.pattern.factory.factorymethod;

public class Apple implements Phone{

	@Override
	public void call() {
		System.out.println("苹果手机在打电话！");
	}

}
