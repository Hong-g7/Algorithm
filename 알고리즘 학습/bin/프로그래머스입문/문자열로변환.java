package 프로그래머스입문;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 문자열로변환 {

	public static void main(String[] args) {
		Solution11 s = new Solution11();
		int n = 123;
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution11 {
	  public String solution(int n) {
	        String answer = Integer.toString(n);
	        return answer;
	    }
	}