import java.util.*;
public class ques_1
{
public static void main(String args[])
	{
	String str1,str2;
	System.out.println("Enter two strings");
	Scanner obj=new Scanner(System.in);
	str1=obj.next();
	str2=obj.next();
	int len1=str1.length();
	int len2=str2.length();
	int i=0,l;
	if (len1<len2){
		l=len1;
	}
	else{
		l=len2;
	}

	int result=0;
	while(i<l)
	{
		if(str1.charAt(i)<str2.charAt(i))
		{result=1;
		break;
		}
		else if(str1.charAt(i)>str2.charAt(i))
		{result=2;
		break;
		}
		i+=1;
	}
	switch(result){
	case 0:
	{
		if(len1==len2) System.out.println(str1 +" and "+ str2 +" are equal");
		else if(len1<len2) System.out.println(str1 +" is smaller than " + str2);
		else System.out.println(str2 + " is  smaller than " + str1);
		break;
	}
	case 1:{ 
		System.out.println(str1 +" is smaller than " + str2);
	break;
	}
	case 2:{
		System.out.println(str2 + " is  smaller than " + str1);
	break;}
	}}
}