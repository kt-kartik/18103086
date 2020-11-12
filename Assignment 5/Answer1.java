public class Answer1 extends Thread
{
    public static void main(String[] args)
    {
        Answer1 i = new Answer1();
        i.start();
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
            if((i+1)%10 == 0) {
                System.out.println("10 numbers printed");
	}
            try
            {
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

}
