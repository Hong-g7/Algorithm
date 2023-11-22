package 프로그래머스입문;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 공백으로구분하기1 {
	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String[] result = s.solution("my string"); // 200
		System.out.println(Arrays.toString(result));
		
	}
}

class Solution9 {
	public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}