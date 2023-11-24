package 배열문제;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 대문자로바꾸기 {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String myString = "aBcDeFg";
		String result = s.solution(myString);
		System.out.println(result);
	}
}

class Solution1 {
    public String solution(String myString) {
        String answer =myString.toUpperCase();
        return answer;
    }
}