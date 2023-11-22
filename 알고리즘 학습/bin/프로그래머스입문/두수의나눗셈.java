package 프로그래머스입문;

import java.util.Scanner;

public class 두수의나눗셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Solution8 s = new Solution8();
		int result = s.solution(num1, num2); // 200
		System.out.println(result);
		sc.close();
	}
}

class Solution8 {
	  public int solution(int num1, int num2) {
	        double answer = (double)num1/num2;
	        return (int)(answer * 1000);
	    }
	}