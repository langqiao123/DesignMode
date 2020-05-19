package org.langqiao.pattern.factory.abstractfactory;

public class LowPhoneFactory implements PhoneFactory{
	
	public Cpu createCpu() {
		return new LowCpu();
	}
	public Memory createMemory() {
		return new LowMemory();
	}
	public Shell createShell() {
		return new LowShell();
	}
}
