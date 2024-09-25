import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//sumOfDigit(num);
		int res=singleDigit(num);
		System.out.println(res);

	}

	public static int singleDigit(int num) {
		
		while(num>10)
		{
			num=sumOfDigit(num);
		}
		return num;
		
	}

	public static int sumOfDigit(int num) {
		int sum=0;
		while(num>0)
		{
			sum += num % 10;
            num /= 10;
			System.out.println(sum);
		}
		return sum;
			
		
		
		
		
		
		
	}

}
