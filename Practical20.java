
interface Parent1
{
    void show();
}

interface Parent2 
{
    void show1();
}

class Child implements Parent1, Parent2
{
    public void show()
    {
        System.out.println("From Parent1");
    }

    public void show1()
    {
        System.out.println("From Parent2");
    }
}

class Practical20
{
    public static void main(String args[])
    {
        Child eg = new Child();
        eg.show();
        eg.show1();
    }
}