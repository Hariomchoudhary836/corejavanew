package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner {

public static void main(String[] args) throws IOException {
	FileReader read = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
	Scanner sc = new Scanner(read);
	while (sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
	read.close();
}
}
