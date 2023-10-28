package in.com.javaio;

public class TestCharcount {
public static void main(String[] args) {
	String name = "malayalam";
//	char ch[]=name.toCharArray();
//	for (int i = 0; i < ch.length; i++) {
//		
//		int count = 0;
//		for (int j = i+1; j < ch.length; j++) {
//			if (ch[i]==ch[j]) {
//				count++;
//				ch[j]='\0';
//			}
//		}
//		if (ch[i]!='\0') {
//			System.out.println(ch[i]+ " "+count);
//		}
//	}
	
	int count = 0;
	for (int i = 'a'; i < 'z'; i++) {
		for (int j = 0; j < name.length(); j++) {
			if (name.charAt(j)==i) {
				count++;
			}
		}
			if (count>0) {
				System.out.println(i+" "+count);
			}
			count = 0;
	}
}
}