package com.bcl.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * @author bcl
 * foreach是用Iterator实现的，int expectedModCount = modCount;每次做修改的时候modCount+1，next()的时候要判断
 * expectedModCount = modCount，不等抛异常，迭代时修改会导致不等就跑异常。如果删倒数第二个数时，cours等于size所有判断hasNext为false
 * 所以不会再执行next();所以不会报错，而且倒数第二个也被删除了。
 */
public class A2_DeleteWhenForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		System.out.println("原来的list:" + list);
		for (String string : list) {
			System.out.println(string);
			// 如果获取的内容是"2"，就把它删除
			if ("5".equals(string)) {
				list.remove(string);
			}
		}
		System.out.println("修改后的list:: " + list);
	}
}