package Firma;

public class Developer
{
    private Device device;


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
}
