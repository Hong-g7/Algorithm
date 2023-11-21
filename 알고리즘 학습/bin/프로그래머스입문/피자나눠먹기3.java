
	package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("slice>>");
			int slice =sc.nextInt();
			System.out.print("사람수>>");
			int n =sc.nextInt();
			
			Solution7 s = new Solution7();
			int result = s.solution(slice,n); // 
			System.out.println(result);
		}

	}

	class Solution7 {
		//n = 방문 사람수
		public int solution(int slice, int n) {
	        int answer = 0;
	        if (n<=slice) {
				answer=1;
			}else if ((n%slice)==0) {
				answer= n/slice*1;
			}else if (n>slice && n%slice!=0) {
				answer = (n/slice)+1;
			}
	        return answer;
	    }
	}