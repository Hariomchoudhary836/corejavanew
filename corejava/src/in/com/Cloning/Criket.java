package in.com.Cloning;

class Criket1 implements Cloneable{
   String ground;

public Criket1() {
	this.ground = ground;
}
   
   @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class pament implements Cloneable{
	int fee;
	String name;
	
	Criket1 c = new Criket1();
	public pament(int fee, String name,String ground) {
		this.fee = fee;
		this.name = name;
		this.c.ground = ground;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	     pament p = (pament) super.clone();
	     p.c = (Criket1) c.clone();
		return p;
	}
}
public class Criket{
	public static void main(String[] args) throws CloneNotSupportedException {
		pament p1 = new pament(200, "sr","indore");
		pament p2 = (pament) p1.clone();
		
		p2.fee = 30000;
		p2.name = "hari";
		p2.c.ground = "holkar";
		
		System.out.println(p1.fee);
		System.out.println(p1.name);
		System.out.println(p1.c.ground);
		
		System.out.println(p2.fee);
	    System.out.println(p2.name);
		System.out.println(p2.c.ground);
	}
}
