class Practical3 
{
    public static void main(String args[])
    {
        int a=10, b=20, c=50;

        int max = (a > b )? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
}