package PCCE기출문제;

import java.util.HashSet;
import java.util.Iterator;

public class 저축 {

	public static void main(String[] args) {
		//set은 꺼내는 기능이 없다. 순서도 없다.
		HashSet<String> set = new HashSet<String>();
		set.add("휴대폰");
		set.add("휴지;");
		set.add("휴지;");
		System.out.println(set);
		//반복자(iterlator, 이터레이터)
		//set에 있는 값을 하나씩 꺼내려면 반복자를 달아줘야함
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			// array --> list : Arrays.asList()
			// list  --> array : list.toArray()
			// set   --> array : set.toArray()
		}
	}

}
