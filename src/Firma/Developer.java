package Firma;

public class Developer implements Comparable<Developer>
{
    private Device device;
    private int workingYears;


    public Developer(Device device, int workingYears)
    {
        this.device = device;
        this.workingYears = workingYears;
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

    public int getWorkingYears()
    {
        return workingYears;
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
