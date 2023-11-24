package 배열고급;

import java.util.Arrays;

public class 배열입력배열반환_고정길이3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution3 s = new Solution3();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] n) {
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		int[] answer = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			answer[i] = n[i]*100;
		}
		return answer;
	}
}