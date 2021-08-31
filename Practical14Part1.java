// Single level inheritance 

class Demo
{
    public void demo()
    {
        System.out.println("Parent class");
    }
}


class Practical14Part1 extends Demo
{

    public static void main(String args[])
    {
        Practical14Part1 eg = new Practical14Part1();
        eg.demo();
        System.out.println("Child Class");
    }

}