package in.com.javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferPractice {
     public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr2.txt");
		BufferedReader b = new BufferedReader(f);
		
		String name = b.readLine();
		while (name != null) {
			System.out.println(name);
			name = b.readLine();
		}
		f.close();
		b.close();
	}
}
