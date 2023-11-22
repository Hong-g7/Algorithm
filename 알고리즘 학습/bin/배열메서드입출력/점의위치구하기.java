package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 점의위치구하기 {

	public static void main(String[] args) {

		Solution6 s = new Solution6();
		int[] dot = { 4, 6 };
		int result = s.solution(dot);
		System.out.println(result);
	}
}

class Solution6 {
	public int solution(int[] dot) {
		int answer = 0;
		if (dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if (dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else if (dot[0] > 0 && dot[1] < 0) { // 수정된 조건
            answer = 4;
		}

		return answer;
	}
}