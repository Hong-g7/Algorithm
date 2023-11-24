package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String my_string = "hi12392";
		int[] result = s.solution(my_string);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	    public int[] solution(String my_string) {
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	char[] c = my_string.toCharArray();
	    	for (int i = 0; i < c.length; i++) {
				if (c[i] > 47 && c[i]<58) {
					list.add(c[i]-48);
				}
			} 
	    	int[] answer = new int[list.size()];
	    	for (int i = 0; i < list.size(); i++) {
				answer[i]=list.get(i);
			}
	    	Arrays.sort(answer);
	        return answer;
	        
	    }
	}