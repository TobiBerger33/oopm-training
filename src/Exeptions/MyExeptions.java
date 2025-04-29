package Exeptions;

public class MyExeptions extends Exception                           //RuntimeException, wenn es unchecked sein soll
{
    public MyExeptions()
    {

    }

    public MyExeptions(String message)
    {
        super(message);
    }

    public MyExeptions(Throwable cause)
    {
        super(cause);
    }
}
