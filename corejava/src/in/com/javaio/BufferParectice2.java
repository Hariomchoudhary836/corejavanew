package in.com.javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferParectice2{
  public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr2.txt");
	BufferedReader br = new BufferedReader(fr);
	
	String notpad = br.readLine();
	while (notpad != null) {
		System.out.println(notpad);
		notpad = br.readLine();
	}
	fr.close();
	br.close();
}
}
