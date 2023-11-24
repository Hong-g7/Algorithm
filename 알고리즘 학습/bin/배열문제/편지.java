package 배열문제;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import 배열기본.Print;

public class 편지 {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String message = "I love you~";
		int result = s.solution(message);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(String message) {
		int total = message.length();
		int answer = total*2;
		return answer;
	}
}