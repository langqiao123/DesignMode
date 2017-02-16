package org.langqiao.pattern.factory.factorymethod;

public class SamsungPhoneFactory implements PhoneFactory{

	@Override
	public Phone createPhone() {
		return new Samsung();
	}

}
