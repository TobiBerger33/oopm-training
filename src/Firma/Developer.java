package Firma;

public class Developer implements Comparable<Developer>
{
    private Device device;
    private int workingYears;


    public Developer(Device device)
    {
        this.device = device;
    }


    public Device getDevice()
    {
        return device;
    }

    public void setDevice(Device device)
    {
        this.device = device;
    }

    public void startWorking()
    {
        device.doWork();
    }

    @Override
    public int compareTo(Developer o)
    {
        if(workingYears == o.workingYears)
            return 0;
        else if (workingYears > o.workingYears)
            return 1;
        else
            return -1;
    }
}
