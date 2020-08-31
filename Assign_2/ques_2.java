import java.util.*;
public class ques_2
{	public static void main(String args[])
	{
	
	System.out.println("Enter Size of array: ");
	Scanner obj=new Scanner(System.in);
	int x=obj.nextInt();
	
	int arr[]=new int[x];
	System.out.println("Enter the numbers of array: ");
	int i=0;
	while(i<x){
	arr[i]=obj.nextInt();
	i+=1;
	}
	
	int num[]=new int[100005];
	i=0;	
	while(i<21){
		num[i]=0;
		i+=1;
	}
	i=0;
	while(i<x)
	{
		num[arr[i]]++;
		i+=1;
	}

	i=0;
	int start=0;
	while(i<x && start<21)
	{
		while(start<21 && num[start]<=0)
		start++;
		if(start==21) break;
		arr[i++]=start;
		num[start]--;
	}
	i=0;
	while(i<x)
	{
		System.out.print(arr[i]+" ");
		i+=1;
	}
	}
}