package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class 같은숫자는싫어 {

	public static void main(String[] args) {

		Solution03 s = new Solution03();
		int[] num_list = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution03 {
	public int[] solution(int[] num_list) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num_list[0]);
		//앞에 위치의 값과 다르면 list에 add를함(값)
		int before = num_list[0];
		for (int i = 1; i < num_list.length; i++) {
			if (num_list[i]!=before) {
				list.add(num_list[i]);
				before = num_list[i];
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}