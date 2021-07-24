package com.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler implements InvocationHandler {

	Object targetObject;

	public UppercaseHandler(Object targetObject) {
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret = method.invoke(targetObject, args);
		if (ret instanceof String && method.getName().startsWith("say")) {
			return ((String) ret).toUpperCase();
		} else {
			return ret;
		}
	}
}
