import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class ques4
{
	static boolean Anagram(String str1, String str2)
		 {
			if (str1.length()==str2.length())
			 {
				char[] arr = str1.toCharArray();
				Arrays.sort(arr);
				str1= new String(arr);
				arr = str2.toCharArray();
				Arrays.sort(arr);
				str2 = new String(arr);
				if(str1.equals(str2))
				return true;
			}
			return false;

		}
	public static void main(String[] args) 
		{
			String str1,str2;
			Scanner scan=new Scanner(System.in);
			System.out.println("String 1:");
			str1=scan.nextLine();
			System.out.println("String 2:");
			str2=scan.nextLine();
			boolean answer=Anagram(str1,str2);
			if(answer==true)
				System.out.println("Entered strings are anagrams.");
			else
				System.out.println("Entered strings are not anagrams.");
		}
}
