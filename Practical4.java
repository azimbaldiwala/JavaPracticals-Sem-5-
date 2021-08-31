class Practical4
{
    public static void main(String args[])
    {
        int number = 1234;
        int rem;
        System.out.print("Reverse of " + number + " is ");

        while(number != 0)
        {
            rem = number % 10;
            number = number/ 10;
            System.out.print(rem);
        }
    }
}