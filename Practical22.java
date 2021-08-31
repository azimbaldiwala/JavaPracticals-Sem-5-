// Divided by zero error 

class Practical22
{
    public static void main(String args[])
    {
        int a = 10, b = 0;
        try
        {
            int divide = a/b;
        }

        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
}