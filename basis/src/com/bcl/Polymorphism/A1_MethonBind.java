package com.bcl.Polymorphism;
/**
 * 
 * @author bcl
 * 动态绑定是运行期，编译期会根据参数引用类型去找方法，运行期会找实际类型
 *
 */
public class A1_MethonBind {
	public static void main(String[] args) {
		People man=new Man();
		People woman=new Woman();
		f(man);
		f(woman);
	}
	static void f(People p) {
		System.out.println("people");
		p.say();
	}
	static void f(Man man) {
		System.out.println("man");
		man.say();
	}
	static void f(Woman women) {
		System.out.println("women");
		women.say();
	}
}
abstract class  People{
	void say() {
		System.out.println("i am people");
	}
}
class  Woman extends People{
	void say() {
		System.out.println("i am woman");
	}
}
class  Man extends People{
	void say() {
		System.out.println("i am man");
	}
}
