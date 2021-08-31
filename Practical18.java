// Abstract class 

abstract class Shape
{
    abstract public void area();
}

class Triangle extends Shape
{
    float l, b;
    Triangle(float l, float b)
    {
        this.l = l;
        this.b = b;
    }

    public void area()
    {
        double area = 1/2 * l * b;
        System.out.println(area);
    }
}

class Rectangle extends Shape
{
    float l, b;
    Rectangle(float l, float b)
    {
        this.l = l;
        this.b = b;
    }

    public void area()
    {
        float area = l * b;
        System.out.println(area);
    }
}

class Circle extends Shape
{
    float l;
    Circle(float l)
    {
        this.l = l;
    }
    public void area()
    {
        float area = l * l;
        System.out.println(area);
    }
}

class Practical18
{
    public static void main(String args[])
    {
        Triangle t = new Triangle(10, 15);
        Rectangle r = new Rectangle(10, 15);
        Circle c = new Circle(10);
        t.area();
        r.area();
        c.area();
    }
}