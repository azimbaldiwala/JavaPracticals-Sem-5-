class Practical2
{

    public static boolean is_prime(int number)
    {
        int flag = 0;
        for(int i=3; i<number; i++)
        {
            if(number % i == 0)
            {
                flag = 1;

            }
        }

        if(flag==1){

            return false;
        }

        return true;
    }

    public static void main(String args[])
    {

        int n = 100;

        for(int i=2; i<=n; i++)
        {
            if(is_prime(i))
            {
                System.out.println(i);
            }
        }
    }
}