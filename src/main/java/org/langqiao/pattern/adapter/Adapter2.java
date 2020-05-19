package org.langqiao.pattern.adapter;

public class Adapter2 implements Target{

	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void exchangeUsb() {
		adaptee.exchangePs2();
	}

}
