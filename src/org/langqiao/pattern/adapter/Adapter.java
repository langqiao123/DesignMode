package org.langqiao.pattern.adapter;

/**
 * 
 * @author mingyangyang
 * 适配器类
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void exchangeUsb() {
		super.exchangePs2();
	}

}
