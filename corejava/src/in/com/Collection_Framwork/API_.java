package in.com.Collection_Framwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class API_ {

public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	  list.add(100);
	  list.add(101);
	  list.add(102);
	  list.add(103);
	  list.add(104);
	  list.add(105);
	  list.add(106);
	  list.add(50);
	  list.add(51);
	  list.add(30);
	  
	  System.out.println(list);
	  
	//method 1
		List<Integer> evenlist = new ArrayList<Integer>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				evenlist.add(i);
			}
		}
		System.out.println(evenlist);
		
		//method 2
		Stream<Integer>stream = list.stream();
		List<Integer> newList = stream.filter(e->e % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		//method 3
		Stream<Integer> s1 = list.stream();
		List<Integer> newList1 = s1.filter(i->i>50).collect(Collectors.toList());
		System.out.println(newList1);
}
}
