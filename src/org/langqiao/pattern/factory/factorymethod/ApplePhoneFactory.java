package org.langqiao.pattern.factory.factorymethod;

public class ApplePhoneFactory implements PhoneFactory{

	@Override
	public Phone createPhone() {
		return new Apple();
	}

}
