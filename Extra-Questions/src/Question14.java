import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of terms in the series:");
	        int n = scanner.nextInt();

	        long sum = 0;
	        long term = 0;

	        for (int i = 1; i <= n; i++) {
	            term = term * 10 + 3;
	            sum += term;
	            System.out.println("The sum of the series is: " + sum);	
	        }

	        System.out.println("The sum of the series is: " + sum);	
	}

}
