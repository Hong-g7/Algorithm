package 배열응용;

import java.util.Arrays;
import java.util.Random;

import 배열기본.Print;

public class 배열최소값찾기2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[1000];
		for (int i = 0; i < n.length; i++) {
			n[i] =r.nextInt(1000);
		}
		int max = n[0];
		for (int x : n) {
			if(x>max) {
				max =x;
			}
		}
		System.out.println(max);
		Print.arr(n);
	}

}