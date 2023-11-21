
	package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
			int slice =sc.nextInt();
			
			Solution6 s = new Solution6();
			int result = s.solution(79); // 
			System.out.println(result);
		}

	}

	class Solution6 {
		//n = 방문 사람수
		 public int solution(int n) {
				int answer = 0;
				if (n<=7) {
					answer = 1;
				}
				else if ((n%7 == 0)) {
					answer = n/7;
				}else if (n>7 && n%7!=0) {
					answer = (n/7)+1;
				}
				//피자 몇 조각이 필요할까요??
				return answer;
			}
		}