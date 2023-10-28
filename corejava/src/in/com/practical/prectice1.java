package in.com.practical;

import java.util.Arrays;

public class prectice1 {
  public static void main(String[] args) {
	String name = "rahul";
	char ch[]=name.toCharArray();
	for (int i = 0; i < ch.length/2; i++) {
		char temp = ch[i];
		//System.out.println(ch[i]);
		ch[i] = ch[ch.length-1-i];
		ch[ch.length-1-i]=temp;
	}
	name = Arrays.toString(ch);
	System.out.println(name);
	}
}