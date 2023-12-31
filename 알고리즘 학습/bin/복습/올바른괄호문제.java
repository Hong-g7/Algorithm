package 복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "()()";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public boolean solution(String s2) {
		//스택에다가 String의 char를 하나씩 넣으면된다
		//'('는 push!,')'는 pop! ==> 짝이 맞으면
		Stack<Character> stack = new Stack<Character>();
		//배열 --> length, String --> lenth(), list/set/map --> size()
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i)=='(') {
				stack.push('(');
			}else {
				stack.pop(); //top를 제거해라!
			}
		}
		//System.out.println(stack.empty());
		boolean answer = stack.empty();
		return answer;
	}
}
