
// Passing the object as an argument

class Demo
{

    public Demo demo(Demo d)
    {
        return this;
    }
}

class Practical12
{
    public static void main(String args[])
    {
        Demo a = new Demo();
        Demo b = new Demo();

        b = b.demo(a);
        
    }
}