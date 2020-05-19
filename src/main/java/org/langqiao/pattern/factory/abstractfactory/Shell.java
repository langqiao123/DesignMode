package org.langqiao.pattern.factory.abstractfactory;

/**
 * 手机外壳抽象
 * @author mingyangyang
 *
 */
public interface Shell {
	void touch();
}

class HighShell implements Shell{

	@Override
	public void touch() {
		System.out.println("高级手机外壳摸着很舒服！");
	}
}

class LowShell implements Shell{
	
	@Override
	public void touch() {
		System.out.println("低级手机外壳摸着很一般！");
	}
}
