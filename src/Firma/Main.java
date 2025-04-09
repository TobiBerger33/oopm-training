package Firma;

public class Main
{
    public static void main(String[] args)
    {
        Device tablet = new Tablet("iPad Air 5th Gen");
        Developer hans = new Developer(tablet);

        Device laptop = new Laptop("MacBook Air M2");
        Developer susi = new Developer(laptop);

//        hans.getDevice().doWork();
//        susi.getDevice().doWork();

        Company company = new Company(30);

        company.addDev(hans);
        company.addDev(susi);

//        hans.startWorking();
//        susi.startWorking();

//        company.sendToWork();

        Developer john = new JuniorDev(tablet);
        Developer max = new SeniorDev(laptop);

        company.addDev(john);
        company.addDev(max);

        company.sendToWork();



        WorkInterface workInterface = new Work();
        workInterface.doWork();

        WorkInterface workInterface2 = () ->
        {
            System.out.println("Doing hard work");
        };

        workInterface2.doWork();




    }
}
