package in.com.Coparatorhari;

public class Hariom {
    int Id ;
    String name;
    String Adress;
    
	public Hariom(int id, String name, String Adress) {
		this.Id = id;
		this.name = name;
		this.Adress = Adress;
	}

	@Override
	public String toString() {
		return Id+" "+name+ " "+ Adress;
	}
    
}
