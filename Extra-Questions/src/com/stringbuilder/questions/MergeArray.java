package com.stringbuilder.questions;
public class MergeArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		
		String [] brr= {"A","B","C"};
		
		if(arr.length!=brr.length)
		{
			System.out.println("Array must be same size");
			return;
		}
		
		StringBuilder output= new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			output.append(arr[i]).append(",").append(brr[i]);
			if(i<arr.length-1)
			{
				output.append(",");
			}
		}
		System.out.println(output.toString());

	}

	
}
