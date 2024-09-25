import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1=sc.next();
		System.out.println("Enter 2nd string");
		String str2=sc.next();
		
		for(int i=0;i<str1.length();i++) {
			int flag=0;
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j) ) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(str1.charAt(i) + " ");
			}
		}
		for(int i=0;i<str2.length();i++) {
			int flag=0;
			for(int j=0;j<str1.length();j++) {
				if(str2.charAt(i) == str1.charAt(j)) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(str2.charAt(i) + " ");
			}
		}
		
	}

}
