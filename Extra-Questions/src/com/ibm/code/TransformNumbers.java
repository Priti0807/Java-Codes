package com.ibm.code;

public class TransformNumbers {

	public static void main(String[] args) {
		int n=3;
		int arr[]= {3,2,4,9,10,12};
		int result[]=oddEvenTransform(arr,n);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

	private static int[] oddEvenTransform(int[] arr, int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%2==0)
				{
					arr[j]-=3;
				}
				else
				{
					arr[j]+=3;
				}
					
			}
		}
		return arr;
	}

}
