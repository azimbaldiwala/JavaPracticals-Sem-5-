// Swappingthe value by passing argument by references.

class Number
{
    public int number;
    Number(int number)
    {
        this.number = number;
    }

    public void swap(Number a, Number b)
    {
        int temp = a.number;
        a.number = b.number;
        b.number = temp;
    }

}

class Practical11
{
    Number x = new Number(10);
    Number y = new Number(20);

    System.out.println("Before Swap");
    System.out.println("X: " + x.number);
    System.out.println("Y: " +  y.number);

    x.swap(x, y);

    System.out.println("After swap");
    System.out.println("X: " +  x.number);
    System.out.println("Y: " + y.number);

}