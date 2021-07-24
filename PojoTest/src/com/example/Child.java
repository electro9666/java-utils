package com.example;

public class Child extends Parent {
	public void proc1() {
		System.out.println("Child proc1");
	}
	public void proc2() {
		System.out.println("Child proc2-1");
		super.proc2();
		System.out.println("Child proc2-2");
	}
}
