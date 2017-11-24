package com.bcl.designPattern.singleton;
/**
 * 
 * @author bcl
 *	线程安全的懒汉模式，不过效率低
 */
public class A3_Siginleton {
	private static A3_Siginleton instance;
	private  A3_Siginleton() {}
	public static synchronized  A3_Siginleton getInstance(){
		if(instance==null) {
			instance=new A3_Siginleton();
		}
		return instance;
	}
}
