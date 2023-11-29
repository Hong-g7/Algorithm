package 배열문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import 배열기본.Print;

public class 숫자떼기 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String result = s.solution("0010");
		System.out.println((result));
	}
}

class Solution5 {
	public String solution(String n_str) {
	
		String answer = n_str.replaceFirst("^0+", "");
		return answer;
	}
}