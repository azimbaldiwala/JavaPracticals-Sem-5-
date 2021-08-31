// constructor overloading with copy constructor.

class Demo
{
    Demo()
    {
        System.out.println("Default constructor called");
    }

    Demo(String s)
    {
        System.out.println("Message by parameterized constructor is " + s);
    }

    Demo(Demo d)
    {
        System.out.print("Copy constructor called");
    }
}

class Practical9
{
    public static void main(String args[])
    {

        Demo a = new Demo();
        Demo b = new Demo("Hello, World!");
        Demo c = new Demo(a);
    }
}

/*
    Output

    Default constructor called
    Message by parameterized constructor is Hello, World!
    Copy constructor called
*/