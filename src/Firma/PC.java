package Firma;

public class PC extends Device
{

    public PC(String name)
    {
        super(name);
    }

    public void doWork()
    {
        System.out.println("PC " + name + " is working");
    }
}
