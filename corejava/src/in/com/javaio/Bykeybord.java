package in.com.javaio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Bykeybord {
  public static void main(String[] args) throws IOException {
	System.out.println("Enter here your text..>>>>");
	InputStreamReader isStream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isStream);
		FileWriter fr = new FileWriter("C:\\Users\\ASUS\\Desktop\\javzio\\bykeybord.txt");
		PrintWriter pr = new PrintWriter(fr);
	    String line = br.readLine();
	    while(!(line.equals("tata"))) {
	    	pr.print(line);
	    }
	    System.out.println("your Compailar is closed ...!!!");
	    
	    isStream.close();
	    br.close();
	    fr.close();
	    pr.close();
   }
}