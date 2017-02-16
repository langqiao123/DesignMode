package org.langqiao.pattern.factory.simplefactory;

public class Client3 {

	public static void main(String[] args) {
		Phone applePhone = PhoneFactory1.createApplePhone("苹果");
		applePhone.call();
		Phone samsungPhone = PhoneFactory1.createSamsungPhone("三星");
		samsungPhone.call();
		Phone vivoPhone = PhoneFactory1.createVivoPhone("vivo");
		vivoPhone.call();
	}

}
