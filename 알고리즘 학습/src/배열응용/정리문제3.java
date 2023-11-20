package 배열응용;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import 배열기본.Print;

public class 정리문제3 {

	public static void main(String[] args) {
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		if (s1.equals(s2)) {
			System.out.println("동일합니다");
		}else {
			System.out.println("동일하지 않습니다.");
		}
		if (s1.length()>s2.length()) {
			System.out.println("s1이 더큼.");
		}else {
			System.out.println("s2가 더큼.");
		}
		
		String s3 = "나는 진짜 java programmer가 되었어";
		String s33 =s3.substring(6,21);
		System.out.println(s33.toUpperCase());
		
		String s4 ="2056521";
		char c = s4.charAt(0);
		if (c==1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		String s5 = "[ 1230, 220, 340, 401, 5034]";
		s5 = s5.replace("[", " ");
		s5 = s5.replace("]", " ");
		System.out.println(s5);
		s5 = s5.trim();
		System.out.println(s5);
		String[] s6 = s5.split(", ");
		Print.arr(s6);
		int sum = 0;
		for (String s : s6) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		int[] newArr = new int[s6.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]=Integer.parseInt(s6[i]);
		}
		Print.arr(newArr);
		Arrays.sort(newArr);
		Print.arr(newArr);
	}
}
