package Multithreading.MiniProject;

class RaceThread extends Thread
{
    private boolean hareSleep;

    public RaceThread(String name, boolean hareSleep)
    {
        super(name);
        this.hareSleep=hareSleep;
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(getName()+" : "+i+" meters");

            if(hareSleep && getName().equals("Hare") && i==60)
            {
                try
                {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                }
            }
        }

        System.out.println(getName()+" finished the race!");
    }
}

public class HareTortoiseRace
{
    public static void main(String[] args)
    {
        RaceThread hare=new RaceThread("Hare",true);
        RaceThread tortoise=new RaceThread("Tortoise",false);

        // Part (b): Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}