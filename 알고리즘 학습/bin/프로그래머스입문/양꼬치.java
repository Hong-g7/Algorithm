
	package 프로그래머스입문;

	public class 양꼬치 {

		public static void main(String[] args) {
			Solution5 s = new Solution5();
			int result = s.solution(10,3); // 70
			System.out.println(result);
		}

	}

	class Solution5 {
		public int solution(int n, int k) {
			int answer = 0;
			int total=n/10;//무료로 받을수 있는 음료 개수
			//전체 지불금액 = 양꼬치 주문금액 + 음료수주문금액
			int sum =n*12000+k*2000;;
			return sum - total*2000;
		}
	
}
