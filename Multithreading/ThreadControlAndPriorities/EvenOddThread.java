package Multithreading.ThreadControlAndPriorities;

class EvenThread extends Thread
{
    public void run()
    {
        for(int i=2;i<=20;i+=2)
            System.out.println(i);
    }
}

class OddThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=19;i+=2)
            System.out.println(i);
    }
}

public class EvenOddThread
{
    public static void main(String[] args)
    {
        EvenThread t1=new EvenThread();
        OddThread t2=new OddThread();

        t1.start();

        try
        {
            t1.join();
        }
        catch(Exception e)
        {
        }

        t2.start();
    }
}