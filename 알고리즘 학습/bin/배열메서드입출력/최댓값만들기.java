package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 최댓값만들기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] numbers = {1, 2, -3, 4, -5};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution1 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		Print.arr(numbers);
		int last = numbers[numbers.length-1];
		int last2 = numbers[numbers.length-2];
		int answer = last * last2;
		
		return answer;
	}
}