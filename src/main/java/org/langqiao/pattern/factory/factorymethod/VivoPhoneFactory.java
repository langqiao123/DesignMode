package org.langqiao.pattern.factory.factorymethod;

public class VivoPhoneFactory implements PhoneFactory{

	@Override
	public Phone createPhone() {
		return new Vivo();
	}

}
