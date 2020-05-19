package org.langqiao.pattern.factory.abstractfactory;

public class HighPhoneFactory implements PhoneFactory{
	
	public Cpu createCpu() {
		return new HighCpu();
	}
	public Memory createMemory() {
		return new HighMemory();
	}
	public Shell createShell() {
		return new HighShell();
	}
}
