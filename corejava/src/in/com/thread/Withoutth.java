package in.com.thread;

public class Withoutth {
 String name = null;
 
   public Withoutth(String name) {
    this.name = name;
}
   public void run() {
	for (int i = 0; i <= 10; i++) {
		System.out.println(name+" "+i);
	}
}
}
