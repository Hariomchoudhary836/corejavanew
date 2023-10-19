package in.com.Collection_Framwork;

import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
public static void main(String[] args) {
	List<String>name = List.of("ram","mohan","rohit","ram","hari","hariom","shyam");
	List<String>newname = name.stream().filter(e->e.startsWith("r")).collect(Collectors.toList());
	
	System.out.println(newname);
	
	//metod 2. jo number double hoga vo.no. nhi print hoga 
	List<Integer> num = List.of(1,2,3,4,5,6,7);
	List<Integer>newnum = num.stream().distinct().collect(Collectors.toList());
	System.out.println(newnum);
	
	//method 3.
	List<Integer> num1 = List.of(1,2,3,4,5,6);
	List<Integer>Squre = num1.stream().map(i->i*i).collect(Collectors.toList());
	
	System.out.println(Squre);
}
}
