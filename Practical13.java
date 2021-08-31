// Factorial using recursion 

class Practical13
{
    public static int factorial(int number)
    {
        if(number == 0)
        {
            return 1;
        }
        else 
        {
            return number * factorial(number - 1);
        }
    }

    public static void main(String args[])
    {
        int fact = 1;
        fact = factorial(5);
        System.out.println(fact);
    }

}