// Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.

class Parent
{
    Parent(String s)
    {
        System.out.println(s);
    }
}


class Practical15 extends Parent
{

    Practical15()
    {
        super("Passed by super to parent class constructor");
        System.out.println("Child class constructor");
    }

    public static void main(String args[])
    {
        Practical15 eg = new Practical15();
    }
}