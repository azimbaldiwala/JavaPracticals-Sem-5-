// Example for this keyword, checking if this keyword can access the private members or not.


class ThisExample
{
    private String s = "Hello, World!";

    public void print()
    {
        String s = this.s;
        System.out.println(s);
    }
}



class Practical8
{

    public static void main(String args[])
    {
        ThisExample eg = new ThisExample();
        eg.print();
    }
}