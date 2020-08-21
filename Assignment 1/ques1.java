import java.util.Scanner;
public class ques1
{
	public static void main(String[] args)
	{
		String s1,s2;
		System.out.println("Enter main string: ");
		Scanner scan= new Scanner(System.in);
		s1=scan.nextLine();
		System.out.println("Enter substring: ");
		s2=scan.next();
		int l1=s1.length();
		int l2=s2.length();
		int x=0,count=0;
		if(l1<l2)
		System.out.println("0");
		else {
			int [] a;
			int [] b;
			a= new int[500];
			b=new int[500];
			for (int i=0;i<l2;i++)
				 b[(int)s2.charAt(i)]++;
			for(int i=0;i<l2;i++){

		          int l=(int)s1.charAt(i);
		          if(a[l]<b[l])
		            x++;
		          a[l]++;

		          if(x==l2)
		            count++;}

		          for(int i=l2;i<l1;i++){

		         int l=(int)s1.charAt(i);
		        int y=(int)s1.charAt(i-l2);

		        if(a[y]<=b[y])
		        x--;

		        a[y]--;

		        if(a[l]<b[l])
		        x++;

		        a[l]++;

		        if(x==l2)
		        count++;}

		        System.out.println(count);		
		}
			
	}
}
