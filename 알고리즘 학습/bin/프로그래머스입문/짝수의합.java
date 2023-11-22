package 프로그래머스입문;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 짝수의합 {

	public static void main(String[] args) {
		Solution12 s = new Solution12();
		int n = 10;
		int result = s.solution(n);
		System.out.println(result);
	}
}

class Solution12 {
	   public int solution(int n) {
	        int answer = 0;
	        for (int i = 2; i <= n; i+=2) {
				answer+= i;
			}
	        
	        return answer;
	    }
	}