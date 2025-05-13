package Firma;

public class Developer implements Comparable<Developer>
{
    private Device device;
    private String name;
    private int workingYears;
    protected int points;


    public Developer(Device device, int workingYears)
    {
        this.device = device;
        this.workingYears = workingYears;
    }

    public Developer(String name, int workingYears)
    {
        this.name = name;
        this.workingYears = workingYears;
        points = 0;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setWorkingYears(int workingYears)
    {
        this.workingYears = workingYears;
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
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
