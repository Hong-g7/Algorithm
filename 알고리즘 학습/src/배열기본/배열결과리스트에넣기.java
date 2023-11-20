package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class 배열결과리스트에넣기 {

	public static void main(String[] args) {
		
		int[] n = { 100, 200, 300, 400, 500 };
		Print.arr(n);
		
		System.out.println(Arrays.toString(n));
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i]>=300) {
				list.add(i);	
				count++;
			}
		} 
		
		System.out.println(count);
		System.out.println(list);
		
		// 1.전체목록프린트
		// 2.300이상 들어있는 위치를 arraylist에 모으세요.
		// 3.arraylist안 인덱스에 배열의 값들에서 100만큼 빼주세요.
		// 4.수정된 배열 전체 프린트
		
		for (Integer index : list) {
			n[index]-=100; 
			//n[index]=n[index]-100; 이걸 간소화한것.
		}
		System.out.println(Arrays.toString(n));
		
		for (int i = 0; i < list.size(); i++) {
			n[i]-=100; 
		}
		Print.arr(n);
	}
}