import java.util.Scanner;

public class FareCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String destination[]= {"SW", "FC", "SN", "PC", "HN", "CC" , "KN", "DC"};
		
		int fare[]= {800, 600, 750, 900, 1400, 1200, 1100, 1500};
		
		int distance=0;
		double travelFare=0;
		double fareRate=0.005;
		int i=0;
		int k=1;
		System.out.println("Kindly Enter destination from list");
		for(int j=0;j<=destination.length-1;j++)
		{
			System.out.println(k++ +" "+destination[j]);
			
		}
		System.out.println("\n Enter Source: ");
		String source=sc.next();
		System.out.println("Enter Destination: ");
		String dest=sc.next();
		
		while(!destination[i].equalsIgnoreCase(dest))
		{
			i++;
		}
		while(!destination[i].equalsIgnoreCase(dest))
		{
			distance = distance+fare[i];
			i++;
			if(i==destination.length)
			{
				i=0;
			}
		}
		distance = distance+fare[i];
		travelFare=fareRate*distance;
		System.out.println("Total travel Between " + source + " and " + dest +
				" is " +  travelFare + "rupees");
		
				
		
	}

}
