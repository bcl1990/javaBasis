package com.bcl.simpleAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class A1_fenzhi {
	 public static void main(String[] args) {
		 int[] arr= {4,16,5,7,9,8};
		 //int[] arr= {4,5};
		 Map map=new HashMap();
		 System.out.println(f(arr,0,arr.length-1,arr[0]));;
	    }
	 static int  f(int[] arr,int i,int j,int max){
		 if(j==i) {
			 return max;
		 }
		 if(j-1==i) {
			 return g(arr[i],arr[j]);
		 }else {
			max=g(f(arr,i,(i+j)/2,arr[(i+j)/2]),f(arr,(i+j)/2,j,arr[(i+j)/2])); 
		 }
		 return max;
	 }
	 static int g(int a,int b) {
		 if(a>b) {
			 return a;
		 }else {
			 return b;
		 }
	 }
}

