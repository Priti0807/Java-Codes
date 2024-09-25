package com.ibm.code;

public class Password {

	public static void main(String[] args) {
		String pwd="0101010";
		
		int result= minFlips(pwd);
		System.out.println(result);

	}

	public static int minFlips(String pwd) {
		
		int countFlip=0;
		for(int i=0;i<pwd.length()-1;i+=2)
		{
			if(pwd.charAt(i)!=pwd.charAt(i+1))
			{
				countFlip++;
			}
		}
		
		return countFlip;
	}

}
