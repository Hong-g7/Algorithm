package 문자열관련;

public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int num = 1234;
		int result = s.solution(num);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		String s = String.valueOf(n);
		//string의 값들을 하나씩 떨어뜨리는 방법은 2가지
		//1)char로 분리
		char[] c = s.toCharArray();
		//2)string로 분리
		String[] s2 = s.split("");
		//하나씩 꺼내서 int로 변경후 ,더해주자.
		int answer = 0;
		for (int i = 0; i < s2.length; i++) {
			int x = Integer.parseInt(s2[i]);
			answer = answer+x;
		}
		return answer;
	}
}