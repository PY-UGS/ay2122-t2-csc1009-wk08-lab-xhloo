import java.io.*;

public class InsufficientFundsException extends Exception // build in class
{
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}
