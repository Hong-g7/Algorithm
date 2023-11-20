package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		// 입력하는 객체 필요 Scanner
		// 많은 양의 데이터를 선형으로 넣을 수 있는 객체
		// 배열을 사용
		Scanner sc = new Scanner(System.in);
		double[] ar = new double[5];
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print("값을 입력하세요>>");
			ar[i] = sc.nextDouble();
		} 
		sc.close();
		System.out.println(Arrays.toString(ar));
		int count = 0;
		String location = " ";
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]==22.2) {
				System.out.println("22.2의 위치는"+i);
			}else if(ar[i]==33.3){
				System.out.println("33.3의 위치는"+i);
				count++;
				location = location+i+" ";
				list.add(i);
			}
		}
		System.out.println(list);
		System.out.println(count);
		System.out.println("33,3위치는"+location);
		//list안에 있는 인덱스에 333.3을 넣어보세요!
		for (int i = 0; i < list.size(); i++) {
			//2,3
			int index = list.get(i);
			ar[index]=333.3;
		}
		System.out.println(Arrays.toString(ar));
	}
}
