  
import java.util.*;
public class ques_3
{
	public static void main(String[] args) {
	Scanner obj =new Scanner(System.in);
String str = obj.next();
int j=0,i=0,k=0,ind=0;
char temp=0;

char[] arr = str.toCharArray();
int len=arr.length;
  while(i<len-1) {
      ind=i;
      j = i+1;
      while(  j < len) {
 
       	if(arr[j]<arr[ind]){
          	ind=j;
            	}
	j+=1;
       }
       temp=arr[ind];
       arr[ind]=arr[i];
       arr[i]=temp;
       i+=1;
}  
 

 
while(k<len){
System.out.print(arr[k]);
k+=1;
}
 
}
 
 

}