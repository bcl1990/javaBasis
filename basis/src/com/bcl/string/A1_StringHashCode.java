package com.bcl.string;
/**
 * 
 * @author bcl
 *	String hashCode实现方式:从第一个字符ASCII码*31，加第二个字符和再*31，一直循环，加到最后一个.
 *	开始取缓存的h， int h = hash;
        if (h == 0 && value.length > 0)
        	如果hash没计算过先计算，最后赋值给hash
 */
public class A1_StringHashCode {
	public static void main(String[] args) {
		String str="123";
		System.out.println(str.hashCode());
		int hashCode=('1'*31+'2')*31+'3';
		System.out.println(hashCode);
	}
	
	
}
