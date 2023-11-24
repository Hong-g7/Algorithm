package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = { "감자", "고구마", "우유", "감자", "양파" };
		System.out.println(Arrays.toString(냉장고음식));
		// 1.감자가 들어있는 마지막 위치를 구해보세요. 전체 출력
		String[] answer = {};
		List<String> list = Arrays.asList(냉장고음식);
		int index = list.lastIndexOf("감자");
		System.out.println(index);
		//2.양파를 포함하고 있으면 "양파는 안사도 된다."출력
		boolean result = list.contains("양파");
		if (result=true) {
			System.out.println("양파는 안사도 된다.");
		}
		//3.우유를 "춘식이 우유"로 수정해보자. 전체출력
		List<String> list2 = new ArrayList<String>(Arrays.asList(냉장고음식));
		//if (index==3) {
		//	냉장고음식[2]="춘식이 우유";
		//}
		list.set(2, "춘식이우유");
		int index2 = list.indexOf("양파");
		list.set(4,"양파즙");
		System.out.println(Arrays.toString((냉장고음식)));
	}
}
