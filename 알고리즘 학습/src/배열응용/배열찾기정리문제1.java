package 배열응용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import 배열기본.Print;

public class 배열찾기정리문제1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Print.arr(arr);
		
		Arrays.sort(arr);
		Print.arr(arr);
		
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		Print.arr(arr);
		System.out.println("======================");
		
		String s1 = "최소값의 위치는 >> ";
		String s2 = "최대값의 위치는 >> ";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[0]) {
				s1 += i + " ";
			} else if (arr[i] == arr[9]) {
				s2 += i + " ";
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}


