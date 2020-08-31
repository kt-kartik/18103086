public class ques_4{
    public static void main(String[] args)
        {
        int num,sum=0;
        for(num=1;num<Integer.MAX_VALUE;num++)
           {
            sum+=num;
            if(sum==num*num){
                System.out.println("Ans: "+num);
            }
            }	
    }
}