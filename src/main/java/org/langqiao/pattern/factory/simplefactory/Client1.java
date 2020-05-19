package org.langqiao.pattern.factory.simplefactory;

public class Client1 {

	public static void main(String[] args) {
		Phone applePhone = new Apple();
		applePhone.call();
		Phone samsungPhone = new Samsung();
		samsungPhone.call();
		Phone vivoPhone = new Vivo();
		vivoPhone.call();
	}

}
