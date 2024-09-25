import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		System.out.println("Enter the number(n) for giving sum of series 3+7+13+21+31.....+N");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=4;
		int start=3;
		int sum=0;
		
		
		for(int i=0;i<n;i++)
		{
			sum=sum+start;
			start=start+num;
			num=num+2;
		}
		System.out.println(sum);
		
	}

}
