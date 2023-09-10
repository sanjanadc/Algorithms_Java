package com.san.data.structure;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String s = "A man, a plan, a canal: Panama";
	System.out.println(palindrome(s));
	}
	
	public static Boolean palindrome(String s)
	{
		int i =0; 
		int j = s.length()-1;
		
		while(i<j)
		{
			if(i<j && !Character.isLetterOrDigit(s.charAt(i)))
			{
				i++;
				break;
			}
				
			if(i<j && !Character.isLetterOrDigit(s.charAt(j)))
			{
				j--;
				break;
			}
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
			{
				return false;
			}
			i++;
			j--;
				
		}
		return true;
	}

}
