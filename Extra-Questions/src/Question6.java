import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String arr=sc.next();
		
		System.out.println("Enter Key: ");
		int key=sc.nextInt();
		int count=(int) Math.log10(key)+1;
		//System.out.println(count);
		int key2=key;
		for(int index=0;index<arr.length();index++)
		{
			int current=arr.charAt(index)-'a'+1;
			if(count==0)
			{
				count=(int) (Math.log10(key)+1);
				key2=key;
			}
			
			int dev = (int) Math.pow(10, --count);
            current += key2 / dev;
            key2 %= dev;

            System.out.print(current + "\t");
		}
		
		

	}

}
