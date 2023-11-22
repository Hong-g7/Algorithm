package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		Solution s = new Solution();
		 int[] strlist = s.solution(10000);
		System.out.println(Arrays.toString(strlist));
	}
}

class Solution {
    public int[] solution(int money) {
    	int count = money/5500;
		int change = money%5500;
		System.out.println(count+" "+change);
		int[] answer = {count,change};
		return answer;
	}
}