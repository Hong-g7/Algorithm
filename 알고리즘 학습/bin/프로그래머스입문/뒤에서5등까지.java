package 프로그래머스입문;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 뒤에서5등까지 {
	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int[] num_list = new int[]{12, 4, 15, 46, 38, 1, 14};
		int[] answer = s.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution10 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[5];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
		}
	}
