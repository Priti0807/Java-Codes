import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year;
		System.out.println("Enter the year to check if its leap or not?");
		year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Leap year "+year);
		}
		else if(year%100==0)
		{
			System.out.println("Leap year "+year);
			
		}
		else if(year%400==0)
		{
			System.out.println("Leap year"+year);
			
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
