package Firma;

public class Tablet extends Device
{

    public Tablet(String name)
    {
        super(name);
    }

    public void doWork()
    {
        System.out.println("Tablet " + name + " is working");
    }
}
