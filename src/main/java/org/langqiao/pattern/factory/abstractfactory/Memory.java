package org.langqiao.pattern.factory.abstractfactory;

public interface Memory {
	void storage();
}

class HighMemory implements Memory{

	@Override
	public void storage() {
		System.out.println("高级内存大！");
	}
	
}

class LowMemory implements Memory{
	
	@Override
	public void storage() {
		System.out.println("低级内存小！");
	}
	
}
