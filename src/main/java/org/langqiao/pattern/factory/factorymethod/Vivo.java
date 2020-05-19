package org.langqiao.pattern.factory.factorymethod;

public class Vivo implements Phone{

	@Override
	public void call() {
		System.out.println("vivo手机在打电话！");
	}

}
