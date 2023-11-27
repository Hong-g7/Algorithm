package 비선형구조;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class collection주요함수 {

	public static void main(String[] args) {
		int[] s = { 3, 5, 6, 7, 8, 11, 34, 90, 102 };
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length; i++) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(Collections.frequency(list, 3));
		System.out.println(!list.contains(6));
		System.out.println(list.indexOf(6));
		list.clear();
		System.out.println(list);
	}
}