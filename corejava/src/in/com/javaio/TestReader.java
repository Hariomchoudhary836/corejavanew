package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
   public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
	int ch = reader.read();
	while (ch != -1) {
		System.out.println(ch);
		ch = reader.read();
	}
	reader.close();
}
}