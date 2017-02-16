package org.langqiao.pattern.factory.simplefactory;

public class PhoneFactory {
	
	public static Phone createPhone(String type){
		if("三星".equals(type)){
			return new Samsung();
		}else if ("苹果".equals(type)) {
			return new Apple();
		}else if ("vivo".equals(type)) {
			return new Vivo();
		}else {
			return null;
		}
	}
}
