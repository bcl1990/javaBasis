package com.bcl.object;
/**
 * 
 * @author bcl
 *	1) 先初始化化父类的静态变量，再初始化子类的静态变量(final 修饰的在编译的时候就分配好了)
 *	2) 要new对象时，先初始化父类成员变量，构造方法，在初始化子类成员变量，构造方法
 */
 class Insect extends A1_Beetle{
	int i=9; 
	int j;
	int m=prt("k=");
	Insect(){
		prt("i="+i+",j="+j);
		j=39;
	}
	static int x1=prt("static Insect.x1 initialized");
	
	static int prt(String s) {
		System.out.println(s);
		return 47;
	}
}

 public class A1_Beetle {
	int k=prt("Beetle.k initialized");
	A1_Beetle(){
		prt("k="+k);
		//prt("j="+j);
	}
	static int x2=prt("static Beetle.x2 initialized");
	static int prt(String s) {
		System.out.println(s);
		return 63;
	}
	public static void main(String[] args) {
		prt("Beetle constructor");
		A1_Beetle b = new Insect();
	}
}
