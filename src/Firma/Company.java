package Firma;

public class Company
{
    private String name;
    private Developer[] developers;

    public Company(int count)
    {
        developers = new Developer[count];
    }

    public void addDev(Developer dev)
    {
        for(int i = 0; i < developers.length; i++)
        {
            if(developers[i] == null)
            {
                developers[i] = dev;
                break;
            }
        }
    }

    public void sendToWork()
    {
        for(int i = 0; i < developers.length; i++)
        {
            if(developers[i] != null)
            {
                developers[i].startWorking();
            }
        }
    }
}
