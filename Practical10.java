// Private Constructor and object counter 

class Demo
{
    private Demo(int a)
    {
        System.out.println("Private constructor called");
    }

    static int count = 0;
    Demo()
    {
        count++;

    }

    void numberOfObjects()
    {
        System.out.println("Number of instances are: " + count);
    }
}

class Practical10
{
    public static void main(String args[])
    {
        Demo a = new Demo();
        a.numberOfObjects();
        Demo b = new Demo();
        b.numberOfObjects();
        Demo c = new Demo();
        c.numberOfObjects();
    }
}

/*
    Output:
    Number of instances are: 1
    Number of instances are: 2
    Number of instances are: 3
*/