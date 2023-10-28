package in.com.Coparatorhari;

import java.util.Comparator;

public class HariomId implements Comparator<Hariom>{

//	@Override
//	public int compare(HariomId o1, HariomId o2) {
//		
//		return o1.getId()-getId();
	

	@Override
	public int compare(Hariom o1, Hariom o2) {
		// TODO Auto-generated method stub
		return o1.Id-o2.Id;
	}

}
