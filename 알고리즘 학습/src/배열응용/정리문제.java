package 배열응용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
			System.out.println("값을 입력하시오>>");
			number[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(number));
	}

}
