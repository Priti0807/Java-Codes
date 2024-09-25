package com.stringbuilder.questions;

public class Pallindrome {

	public static void main(String[] args) {
		
		String str="madam";
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		if(str.equals(sb.reverse().toString()))
		{
			System.out.println(str +" is a pallindrome");
		}
		else
		{
			System.out.println(str +" is not a pallindrome");
		}
		

	}

}
