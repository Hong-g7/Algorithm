package 배열문제;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 배열의평균값 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution {
	public double solution(int[] numbers) {
    	double answer = 0;
    	int sum = 0;
    	for (int i = 0; i < numbers.length; i++) {
    		answer =(double)(sum+=numbers[i])/numbers.length;
    		
		}
        return answer;
    }
}