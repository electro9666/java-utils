package com.example;

public class Parent {

	public void proc1() {
		System.out.println("Parent proc1");
	}
	public void proc2() {
		System.out.println("Parent proc2");
		this.proc1(); // 자식클래스가 있으면, 자식클래스가 호출됨.
	}
}
