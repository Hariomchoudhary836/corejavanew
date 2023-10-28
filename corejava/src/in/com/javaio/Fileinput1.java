package in.com.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinput1 {
    public static void main(String[] args) throws IOException {
    	FileInputStream in = new FileInputStream("C:\\Users\\ASUS\\Desktop\\javzio\\thar.jpg");
    	FileOutputStream ot = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\javzio\\new.jpg");
    	int ch = in.read();
    	while (ch != -1) {
		     ot.write(ch);
		     ch = in.read();
		}
    	in.close();
    	ot.close();
    	System.out.println("Data is copy successfuly");
	}
}
