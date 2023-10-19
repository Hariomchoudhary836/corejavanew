package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriterEx {
  public static void main(String[] args) throws IOException {
	FileWriter f = new FileWriter("C:\\Users\\ASUS\\Desktop\\javzio\\writer.txt");
	f.write("Hello i am Heriom choudhary");
    f.close();
    System.out.println("Data write successfuly");
}
}
