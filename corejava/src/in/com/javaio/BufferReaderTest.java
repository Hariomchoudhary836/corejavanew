package in.com.javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {
    public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
		BufferedReader br = new BufferedReader(fr);
	
		String line = br.readLine();
		while (line != null) {
		System.out.println(line);
		line = br.readLine();
	}
    fr.close();
    br.close();
}
}