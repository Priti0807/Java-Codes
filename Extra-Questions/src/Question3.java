import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]=new int[10];
		int maxDiff=0;
		System.out.println("Enter 10 numbers in an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<arr.length;i++)
		{
			int diff=arr[i]-arr[i-1];
			if(diff>maxDiff)
			{
				maxDiff=diff;
			}
		
		}
		System.out.println(maxDiff);
		

	}

}
