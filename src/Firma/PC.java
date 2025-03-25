package Firma;

public class PC extends Device
{

    public PC(String name)
    {
        super(name);
    }

    @Override
    public void doWork()
    {
        System.out.println("PC work " + name);
    }
}
