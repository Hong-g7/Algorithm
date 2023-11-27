package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class K번째큰수확인문제 {

	public static void main(String[] args) {
		int[] n1 = { 22, 33, 66, 11, 10, 15 };
		Arrays.sort(n1);
		int k = 1;
		System.out.println(Arrays.toString(n1));
		System.out.println(n1[n1.length - k]);

		int[] arr = { 22, 22, 44, 11, 33, 55, 66, 20, 10, 30, 55 };
		System.out.println(Arrays.toString(arr));

		TreeSet<Integer> tree = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			tree.add(arr[i]);
		}
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.higher(20));
		Object[] arr2 = tree.toArray(); //배열로바뀜
		System.out.println(arr2[arr2.length-3]);
		
	}

}