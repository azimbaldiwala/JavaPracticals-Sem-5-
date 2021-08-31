// Method overiding 

class Parent
{
    public void show()
    {
        System.out.println("Parent class method");
    }
}

class Child extends Parent
{
    public void show()
    {   
        super.show();
        System.out.println("Child class method");
    }
}

class Practical21
{
    public static void main(String args[])
    {
        Child c = new Child();
        c.show();
    }
}