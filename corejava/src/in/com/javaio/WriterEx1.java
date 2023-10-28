package in.com.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx1 {
   public static void main(String[] args) throws IOException {
	FileWriter write = new FileWriter("C:\\Users\\ASUS\\Desktop\\javzio\\past1.txt");
	write.write("hello i am hariom choudhary and whats your name");
	write.close();
	System.out.println("complited");
}
}
