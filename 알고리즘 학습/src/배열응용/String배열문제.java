package 배열응용;

import java.util.Scanner;

public class String배열문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			System.out.println("전화번호를 입력하세요 >>"); 
			number[i]=sc.nextInt();		
		}
		System.out.println(number);
	}

}
