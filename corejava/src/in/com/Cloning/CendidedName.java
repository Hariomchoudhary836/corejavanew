package in.com.Cloning;

public class CendidedName implements Cloneable{
	String name;
     String addres;
     
     Adhar a = new Adhar();
     
     public CendidedName(String name,String addres,int adharno) {
    	 this.name = name;
    	 this.addres = addres;
    	 this.a.adharno = adharno;
     }
     @Override
    protected Object clone() throws CloneNotSupportedException {
    	CendidedName nm = (CendidedName) super.clone();
    	nm.a = (Adhar) nm.clone();
    	return nm;
    }
}