package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int n = 10;
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <=n; i++) {
			if (i%2!=0) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			 answer[i]=list.get(i);
		}
		return answer;
	}
}