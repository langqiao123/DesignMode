package org.langqiao.pattern.factory.factorymethod;

public class Samsung implements Phone{

	@Override
	public void call() {
		System.out.println("三星手机在打电话！");
	}

}
