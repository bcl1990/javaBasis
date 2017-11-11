package com.bcl.commJdk;

import java.util.Arrays;
import java.util.Random;
/**
 * 
 * @author bcl
 * 1) Random类中实现的随机算法是伪随机，也就是有规则的随机。在进行随机时，随机算法的起源数字称为
 * 种子数(seed)，在种子数的基础上进行一定的变换，从而产生需要的随机数字。
 * 2)相同种子数的Random对象，相同次数生成的随机数字是完全相同的。也就是说，两个种子数相同的Random对象，
 * 第一次生成的随机数字完全相同，第二次生成的随机数字也完全相同。
 * 3)public Random()该构造方法使用一个和当前系统时间对应的相对时间有关的数字作为种子数，然后使用这个种子数构造Random对象。
 * 4)public Random(long seed) 如果seed相同那么两个对象随机出来的是一样的数
 * 5)Math.random
 * 	public static double random() {
        return RandomNumberGeneratorHolder.randomNumberGenerator.nextDouble();
    }
    private static final class RandomNumberGeneratorHolder {
        static final Random randomNumberGenerator = new Random();
    }
    内部也是通过Random实现的
 */
public class A1_Random {
	public static void main(String[] args) {
		Random random =new Random();
		Random random1 =new Random();
		int arr[]=new int[10];
		int arr1[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=random.nextInt();
		}
		for(int i=0;i<10;i++) {
			arr1[i]=random1.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}
}	
