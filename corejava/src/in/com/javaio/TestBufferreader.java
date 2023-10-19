package in.com.javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferreader {
	public static void main(String[] args) throws IOException {
    FileReader file = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
    BufferedReader reader = new BufferedReader(file);
    String line = reader.readLine();
    while (line != null) {
		System.out.println(line);
		line = reader.readLine();
	}
    file.close();
    reader.close();
}
}