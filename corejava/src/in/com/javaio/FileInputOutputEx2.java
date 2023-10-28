package in.com.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputEx2 {
   public static void main(String[] args) throws IOException {
	   FileInputStream in = new FileInputStream("C:\\Users\\ASUS\\Desktop\\javzio\\tr.jpg");
	   FileOutputStream put = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\javzio\\best.jpg");
	   
	   int hari = in.read();
	   while (hari != -1) {
		put.write(hari);
		hari = in.read();
	}
	   in.close();
	   put.close();
	   System.out.println("they are put by successfuly");
}
}
