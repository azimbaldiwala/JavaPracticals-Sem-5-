

class Demo
{
    final int a;
    Demo()
    {
        a = 10;
        System.out.println(a);
    }
    final public void demo()
    {
        System.out.println("Final Method");
    }
}


class Practical16
{
    public static void main(String args[])
    {
        Demo eg = new Demo();
        eg.demo();
        
    }

}