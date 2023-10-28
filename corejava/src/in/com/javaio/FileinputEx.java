package in.com.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputEx {
  public static void main(String[] args) throws IOException {
	FileInputStream input = new FileInputStream("C:\\Users\\ASUS\\Desktop\\javzio\\thar.jpg");
	FileOutputStream output = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\javzio\\lugjari.jpg");
	int ch = input.read();
	while (ch != -1) {
		output.write(ch);
		ch = input.read();
	}
	input.close();
	output.close();
	System.out.println("Data is puted that in jpg");
}
}