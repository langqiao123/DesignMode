package org.langqiao.pattern.factory.factorymethod;

public class Client {
	public static void main(String[] args) {
		Phone applePhone = new ApplePhoneFactory().createPhone();
		applePhone.call();
		Phone samsungPhone = new SamsungPhoneFactory().createPhone();
		samsungPhone.call();
		Phone vivoPhone = new VivoPhoneFactory().createPhone();
		vivoPhone.call();
	}
}
