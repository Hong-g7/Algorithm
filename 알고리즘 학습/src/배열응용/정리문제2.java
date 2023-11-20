package 배열응용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import 배열기본.Print;

public class 정리문제2 {

	public static void main(String[] args) {
	Random r = new Random();
	int[] ar = new int[20];
	
	
	for (int i = 0; i < ar.length; i++) {
		ar[i]=r.nextInt(81);
	}
	
	int max = ar[0];
	for (int x : ar) {
		if (x>max) {
			max = x;
		}
	}
	Print.arr(ar);
	System.out.println(max);
	}
}
