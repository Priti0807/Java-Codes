package com.ibm.code;

public class StringChange {

	public static void main(String[] args) {
		String str="Hakam";
		
		String output=replaceString(str);
		System.out.println(output);

	}

	public static String replaceString(String str) {
		
		StringBuilder result=new StringBuilder();
//		for(char c:str.toCharArray())
//		{
//			if(Character.isLetter(c))
//			{
//				if(c=='a')
//				{
//					result.append("z");
//				}
//				else if(c=='A')
//				{
//					result.append("Z");
//				}
//				else
//				{
//					result.append((char)(c-1));
//				}
//				
//			}
//			else
//			{
//				result.append(c);
//			}
//			
//		}
//		return result.toString();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if((c>='b'&&c<='z')||(c>='B'&&c<='Z'))
			{
				result.append((char)(c-1));
			}
			else if(c=='a') {
				result.append('z');
			}
			else if(c=='A')
			{
				result.append('Z');
			}
			else
			{
				result.append(c);
			}
			
		}
		return result.toString();
	}

}
