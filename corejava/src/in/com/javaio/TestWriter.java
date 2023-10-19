package in.com.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
   public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
	fw.write("Hello i am faine and how are you ???");
	fw.close();
	System.out.println("Data write successfuly");
}
}
