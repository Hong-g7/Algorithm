package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 배열입력값정리 {

	public static void main(String[] args) {
		int[] n = {11, 33, 55, 22, 66, 77, 88, 99,44};
		int sum = 0;
		for (int x : n) {
			sum = sum+x;
		}
		System.out.println((double)sum/n.length);
		
		Arrays.sort(n);
		Print.arr(n);
		int small = n[0]+n[1]+n[2];
		System.out.println(small);
		
		if (n.length%2==0) {
			int median = n.length/2;//뒤 위
			int median2 = n.length/2 - 1;//뒤 위
			System.out.println(n[median]*n[median2]);
		}else {
			int median = n.length / 2;
			System.out.println(n[median] * 10);
		}
	}
}
