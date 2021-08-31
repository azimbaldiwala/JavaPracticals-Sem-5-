
class Bank
{
    float balance = 0;
    public void deposite(float amount)
    {
        this.balance += amount;
        System.out.println(amount + " Deposited");
    }

    public void withdraw(float amount) throws Exception
    {
        if(amount>balance)
        {
            throw new Exception("Not Sufficient Fund!");
        }
        else 
        {
            balance -= amount;
            System.out.println("Balance after withdraw " + balance);
        }
    }
}

class Practical24
{
    public static void main(String args[])
    {
        Bank bank = new Bank();
        bank.deposite(1000);
        try
        {
            bank.withdraw(400);
            bank.withdraw(300);
            bank.withdraw(500);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        

    }
}