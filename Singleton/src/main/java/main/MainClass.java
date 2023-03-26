package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import single.Singleton;

public class MainClass {
	public static void main(String[] args) {
		
		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		
	//	int number = mycls.getNumber();
	//	youcls.setNumber(number);
		
		// singleton을 사용한 경우
		mycls.myMethod();
		youcls.youMethod();
		
		System.out.println(youcls.toString());
		
		HeClass hc = new HeClass();
		
		hc.func();		
		System.out.println(hc.toString());
	

	}
}
