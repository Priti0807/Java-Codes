import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,terms;
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("Enter the terms");
		terms=sc.nextInt();
		
		sumOfSeries(num,terms);
		
	}

	public static void sumOfSeries(int num, int terms) {
		
		int sum=0,totalSum=0;
		int i=1;
		while(i<=terms)
		{
			int temp=num;
			for(int j=1;j<=i;j++)
			{
				sum=sum+temp;
				temp=temp+2;
			}
			i++;
		}
		System.out.println(sum);
	}

}
