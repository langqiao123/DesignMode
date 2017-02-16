package org.langqiao.pattern.factory.abstractfactory;

public interface PhoneFactory {
	Cpu createCpu();
	Memory createMemory();
	Shell createShell();
}
