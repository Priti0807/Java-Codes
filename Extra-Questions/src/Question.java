import java.util.Arrays;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		int arr[]= {10,85,2,6,41,23};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the kth number to search");
		int k=sc.nextInt();
		System.out.println("Kth  Smallest number is: "+findKthSmallestElement(arr,k));
		
		System.out.println("Kth  highest number is: "+findKthHighestElement(arr,k));
	}

	private static int findKthHighestElement(int[] arr, int k) {
		
	//Highest k element
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
		return arr[arr.length-k];
	}

	public static int findKthSmallestElement(int[] arr, int k) {
		//Smallest number function
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(" " +arr[i]);
		
		return arr[k-1];
	}

}
