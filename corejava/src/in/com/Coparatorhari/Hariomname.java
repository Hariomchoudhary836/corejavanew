package in.com.Coparatorhari;

import java.util.Comparator;

public class Hariomname implements Comparator<Hariom>{

	@Override
	public int compare(Hariom o1, Hariom o2) {
		return o1.name.compareTo(o2.name);
	}

}
