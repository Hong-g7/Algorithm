package 배열기본;

import java.util.Arrays;

public class 배열확인 {

	public static void main(String[] args) {
		// 배열(array)은 많은 양의 데이터를 다루기 위한 자료구조
		// 1)배열을 만드는 방법
		// 배열을 만들때 이미 값을 알고있는 경우
		// 선형으로 쭉 값들을 집어 넣음
		int[] ages = { 12, 27, 56 };
		// 변수갯수 = 5개
		System.out.println(ages);
		System.out.println(ages.length);
		System.out.println(ages[0]);
		ages[1] = 55;
		System.out.println(ages[1]);

		// for

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		// for each 값 출력용도로만 사용가능!
		for (int x : ages) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(ages));
		// 2)배열을 만드는 방법
		// 배열을 만들때 값을 모르는 경우
		// 저장공간을 먼저 만들고 값을 나중에 집어 넣음
		double[] weight = new double[5]; // {0.0,0.0,'''}
		weight[0] = 88.8;
		weight[1] = 78.8;
		weight[2] = 68.8;
		weight[3] = 58.8;
		weight[4] = 48.8;

		// 배열의 있는 값을 확인하기!! 방법 3가지!!
		for (double d : weight) {
			System.out.println(d);
		}
		System.out.println(Arrays.toString(weight));
	}
}
