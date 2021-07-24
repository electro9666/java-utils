package com.example;

import java.lang.reflect.Proxy;

public class MyMain {
	public static void main(String[] args) {
//		첫 번째 인자: 프록시 객체
//		두 번째 인자: 메소드 객체(클라이언트가 호출한 메소드)
//		세 번째 인자: 메소드의 인자(클라이언트가 메소드에 전달한 인자)
		Hello hello = (Hello) Proxy.newProxyInstance(HelloTarget.class.getClassLoader(), new Class[] { Hello.class },
				new UppercaseHandler(new HelloTarget()));

		System.out.println(hello.sayHello("aaa"));
		System.out.println(hello.sayHi("bbb"));
	}
}
