package com.bcl.string;
/**
 * 
 * @author bcl
 * 1)一个字符串去调用itern()方法时，会去字符串常量池找是否存在equals()相等的字符，如果有返回该字符,如果没有 在常量池生成一个该字符的拷贝，
 * 	并返回该拷贝的引用，原来在堆中的拷贝和操作数对象还是会保持不变。
 */
public class A3_Itern {
	public static void main(String[] args) {
		String s = new String("1");  
		String s2 = "1";  
		s.intern();  
		System.out.println(s == s2);  
		  
		String s3 = new String("1") + new String("1");  
		String s4 = "11";  
		s3.intern();  
		System.out.println(s3 == s4);
		String ss="acfc";
		System.out.println(ss.charAt(2));
		System.out.println((int)ss.charAt(2));
		System.out.println(ss.codePointAt(2));
	}
}
