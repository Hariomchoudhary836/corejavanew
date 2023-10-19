package in.com.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputTest {
   public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\Desktop\\javzio\\thar.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\javzio\\tr.jpg");
	int ch = fis.read();
	while (ch != -1) {
		out.write(ch);
		ch = fis.read();
	}
	fis.close();
	out.close();
	System.out.println("data copy successfuly !!!");
}
}
