package in.com.Oops;

public class TestShape_1 {
public static void main(String[] args) {
	Shap1 s1 = new Shap1();
	s1.setColor("blue");
	s1.setBw(24);
	
	System.out.println(s1.getColor());
	System.out.println(s1.getBw());
}
}
class Shap1{
	String color = null;
	int bw = 0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBw() {
		return bw;
	}
	public void setBw(int bw) {
		this.bw = bw;
	}
	
}
