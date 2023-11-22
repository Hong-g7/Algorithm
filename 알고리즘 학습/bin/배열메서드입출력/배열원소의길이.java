package 배열메서드입출력;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class 배열원소의길이 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String[] n= {"I", "Love", "Programmers."};
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}

}
class Solution9 {
    public int[] solution(String[] n) {
    	
    	int[] answer = new int[n.length];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = n[i].length();
			
		}
        return answer;
    }
}