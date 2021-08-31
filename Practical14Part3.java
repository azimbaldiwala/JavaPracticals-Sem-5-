// Hierarchicall inheritance

class Parent
{
    public void show()
    {
        System.out.println("Hello, World! from Parent class");
    }
}

class Child1 extends Parent
{
    public void show1()
    {
        System.out.println("Hello, World! from child1 class");
    }
    
}

class Practical14Part3 extends Parent
{

     public void show2()
    {
        System.out.println("Hello, World! from child2 class");
    }

    public static void main(String args[])
    {
        Practical14Part3 eg = new Practical14Part3();
        eg.show();
        eg.show2();

        Child1 c = new Child1();
        c.show();
        c.show1();
    }    
}