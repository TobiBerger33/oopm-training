package Firma;

public class Tablet extends Device
{

    public Tablet(String name)
    {
        super(name);
    }

    @Override
    public void doWork()
    {
        System.out.println("Tablet work " + name);
    }
}
