package org.langqiao.pattern.factory.abstractfactory;

public interface Cpu {
	void run();
}

class HighCpu implements Cpu{

	@Override
	public void run() {
		System.out.println("高级cpu跑的快！");
	}
	
}

class LowCpu implements Cpu{
	
	@Override
	public void run() {
		System.out.println("低级cpu跑的慢！");
	}
	
}