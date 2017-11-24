package com.bcl.string;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		String s1="bcdf";
		String s2="bedf";
		System.out.println(Contains(s1,s2));;
	}
	static boolean Contains(String s1,String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		boolean flag =false;
		for(int i=0;i<c1.length;i++) {
			if(c2[0]==c1[i]) {
				flag=true;
				int n=i;
				for(int j=0;j<c2.length;j++) {
					if(c2[j]!=c1[n]) {
						flag=false;
						break;
					}else {
						n++;
					}
				}
			}
		}
		return flag;
	}
}
