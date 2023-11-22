package 프로그래머스입문;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 공백으로구분하기2 {
	public static void main(String[] args) {
		Solution13 s = new Solution13();
		String[] result = s.solution("i    love  you"); // 200
		System.out.println(Arrays.toString(result));
		
	}
}

class Solution13 {
	public String[] solution(String my_string) {
		my_string.trim();
        String[] answer =my_string.split("\\s+"+" ");
        return answer;
    }
}