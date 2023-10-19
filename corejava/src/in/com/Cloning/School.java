package in.com.Cloning;

public class School implements Cloneable{
   int fees;

public School(int fees) {
	this.fees = fees;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
