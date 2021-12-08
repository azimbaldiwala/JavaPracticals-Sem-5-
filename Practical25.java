class Threads extends Thread{

    String s;
    int mili_sec;
    Threads(String s, int mili_sec)
    {
        this.s = s;
        this.mili_sec = mili_sec;
    }

    public void run()
    {
        for(int i =0 ; i<5; i++)
        {
            try
            {
                Thread.sleep(mili_sec);
            }

            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            
            System.out.println(s);
        }
    }
}

class Practical25
  
{
    public static void main(String args[])
    {
        Threads x = new Threads("Thread 1", 2000);
        Threads y = new Threads("Thread 2", 4000);
        x.start();
        y.start();
    }
}
