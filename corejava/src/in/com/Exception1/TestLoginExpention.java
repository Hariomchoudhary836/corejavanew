package in.com.Exception1;

public class TestLoginExpention{
    public static void main(String[] args) {
    	LoginExpention e = new LoginExpention();
		String name = "admain";
		if(name.equals("admain")){
			System.out.println("yes valid");
		}
	else {
		LoginExpention e1 = new LoginExpention();
			try {
				throw e1;
			} catch (LoginExpention e2) {
				System.out.println(e2);
			}
	}
}
}