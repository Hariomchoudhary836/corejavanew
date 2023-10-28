package in.com.Coparatorhari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestHariom {

public static void main(String[] args) {
	ArrayList<Hariom> hari = new ArrayList<Hariom>();
	hari.add(new Hariom(12, "hariom", "Indor"));
	hari.add(new Hariom(8, "mohit", "dfh"));
	hari.add(new Hariom(11, "lavish", "rty"));
	
	System.out.println(hari);
	
	Collections.sort(hari, new HariomId());
	System.out.println(hari);
	
	
	Collections.sort(hari, new Hariomname());
	System.out.println(hari);
	

}
}
