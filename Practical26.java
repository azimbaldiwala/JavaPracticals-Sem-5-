class ThreadOdd extends Thread
{

    public void run()
    {
        System.out.println("This Thread prints odd numbers");
        for(int i =0; i<=50; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}


class ThreadEven extends Thread
{

    public void run()
    {
        System.out.println("This Thread prints even numbers");
        for(int i =0; i<=50; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}


class Practical26
  
{
    public static void main(String args[])
    {
        ThreadOdd y = new ThreadOdd();
        ThreadEven x = new ThreadEven();
        x.start();
        y.start();
    }
}
