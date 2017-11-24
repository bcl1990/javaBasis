package com.bcl.designPattern.singleton;
/**
 * 
 * @author bcl
 * 恶汉模式，通过静态变量，用到用不到都会在类加载的时候分配内存
 */
public class A2_Siginleton {
	private static A2_Siginleton instance=new A2_Siginleton();
	private A2_Siginleton() {}
	public A2_Siginleton getInstance() {
		return instance;
	}
}
