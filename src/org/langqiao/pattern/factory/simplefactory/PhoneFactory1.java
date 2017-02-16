package org.langqiao.pattern.factory.simplefactory;

public class PhoneFactory1 {
	
	public static Phone createSamsungPhone(String type){
		return new Samsung();
	}
	
	public static Phone createApplePhone(String type){
		return new Apple();
	}
	
	public static Phone createVivoPhone(String type){
		return new Vivo();
	}
}
