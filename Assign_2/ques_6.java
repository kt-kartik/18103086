import java.util.*;
public class ques_6 {
public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		if(num<1 || num>Integer.MAX_VALUE)
		System.out.println("Invalid Input");
		else {
		  System.out.print("Hailstone Sequence is ");
		    while(num!=1)
		{
			System.out.print(num+" ");
			if(num%2!=0)
			num=num*3+1;
			else
			num/=2;
		}
		System.out.print(num+" ");
	}}
}