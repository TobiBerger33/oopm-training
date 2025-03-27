package Firma;

public class Laptop extends Device
{

    public Laptop(String name)
    {
        super(name);
    }

    public void doWork()
    {
        System.out.println("Laptop " + name + " is working");
    }


}
