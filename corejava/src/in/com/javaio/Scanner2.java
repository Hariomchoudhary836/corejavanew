package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanner2 {
  public static void main(String[] args) throws IOException {
	FileReader frr = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr2.txt");
	Scanner print = new Scanner(frr);
	
	while (print.hasNext()) {
		System.out.println(print.nextLine());
	}
	frr.close();
	print.close();
}
}
