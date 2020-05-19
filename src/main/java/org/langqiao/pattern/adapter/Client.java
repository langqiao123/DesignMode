package org.langqiao.pattern.adapter;

public class Client {
	public static void main(String[] args) {
		/*Target t = new Adapter();
		t.exchangeUsb();*/
		Target t = new Adapter2(new Adaptee());
		t.exchangeUsb();
	}
}
