package org.langqiao.pattern.factory.abstractfactory;

public class Client {
	public static void main(String[] args) {
		PhoneFactory highFactory = new HighPhoneFactory();
		PhoneFactory lowFactory = new LowPhoneFactory();
		highFactory.createCpu().run();
		highFactory.createMemory().storage();
		highFactory.createShell().touch();
	}
}
