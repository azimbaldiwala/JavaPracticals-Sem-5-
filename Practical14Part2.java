// Multilevel inheritance 

class Parent1
{
    public void print()
    {
        System.out.println("From Parent1 class");
    }
}

class Parent2 extends Parent1
{
    public void show()
    {
        System.out.println("From Parent2 class");
    }
}

class Practical14Part2 extends Parent2
{

    public static void main(String args[])
    {
        Practical14Part2 eg = new Practical14Part2();
        eg.print();
        eg.show();
        System.out.println("From child class");
    }
}