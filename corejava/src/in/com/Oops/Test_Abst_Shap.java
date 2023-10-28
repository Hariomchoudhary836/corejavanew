package in.com.Oops;

public class Test_Abst_Shap {
  public static void main(String[] args) {
	Abstrect_shap as = new Abstrect_shap() {
		
		@Override
		public void area() {
		 System.out.println("this is Shape area!!");
		}
	};
	as.hello();
	as.area();
	
	Rectengle_abst ra = new Rectengle_abst();
	ra.area();
	ra.hello();
}
}