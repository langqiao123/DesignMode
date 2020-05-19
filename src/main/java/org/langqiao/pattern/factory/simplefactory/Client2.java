package org.langqiao.pattern.factory.simplefactory;

public class Client2 {

	public static void main(String[] args) {
		Phone applePhone = PhoneFactory.createPhone("苹果");
		applePhone.call();
		Phone samsungPhone = PhoneFactory.createPhone("三星");
		samsungPhone.call();
		Phone vivoPhone = PhoneFactory.createPhone("vivo");
		vivoPhone.call();
	}

}
