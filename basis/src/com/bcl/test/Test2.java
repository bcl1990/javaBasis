package com.bcl.test;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		Random random =new Random(1000);
		Random random1 =new Random(1000);
		int arr[]=new int[10];
		int arr1[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=random.nextInt(2);
		}
		for(int i=0;i<10;i++) {
			arr1[i]=random1.nextInt(2);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Math.random());
	}
}
