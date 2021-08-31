
class Practical23 
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        try 
        {
            a[0] = 5;

            try
            {
                a[10] = 10;
            }
            catch(ArithmeticException e)
            {
                e.printStackTrace();
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                e.printStackTrace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        catch(Exception c)
        {
                c.printStackTrace();
        }
    }
}