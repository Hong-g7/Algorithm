package 배열응용;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import 배열기본.Print;

public class 배열최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random();
		r.setSeed(100);
		int[] ar = new int[1000];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=r.nextInt();
		}
		Print.arr(ar);
		
		int max = ar[0];
		
		for (int i = 0; i < ar.length; i++) {
			if (max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println(max);
	}
}