package com.bcl.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author bcl
 * jdk 1.6及以前substring会oom问题
 * 1)jdk 1.6的时候b=a.substring(beginIndex,endIndex)只是移动a里面char[]的启示和结束位置，
 * return ((beginIndex == 0) && (endIndex == count)) ? this :
      new String(offset + beginIndex, endIndex - beginIndex, value);}
          所以b对a里面的char[]数组 value一直有引用。又因为list一直对b有引用，所以会导致内存泄漏。
   2) 怎么解决:return new String(this.largerString.substring(0, 2)) 释放对a数组的引用
   3)jdk1.7里this.value = Arrays.copyOfRange(value, offset, offset+count);
   char[]数组是一个新copy的数组，所以不会对a的数组一直引用。
   
   4)但是，由于数组的复制，使得substring效率变低
 *
 */
public class A2_SubStringOOM {
	private String largerString =new String(new byte[100000]);
	public String getString() {
		return this.largerString.substring(0, 2) ;
	}
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		A2_SubStringOOM a2= new A2_SubStringOOM();
		list.add(a2.getString());
	}
}
