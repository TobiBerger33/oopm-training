package Firma;

public class Main
{
    public static void main(String[] args)
    {
        Device tablet = new Tablet("iPad Air 5th Gen");
        Developer hans = new Developer(tablet, 1);

        Device laptop = new Laptop("MacBook Air M2");
        Developer susi = new Developer(laptop,5);

//        hans.getDevice().doWork();
//        susi.getDevice().doWork();

        Company company = new Company(30);

        company.addDev(hans);
        company.addDev(susi);

//        hans.startWorking();
//        susi.startWorking();

//        company.sendToWork();

        Developer john = new JuniorDev(tablet,1);
        Developer max = new SeniorDev(laptop,9);

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


        company.print("five");
        company.print(5);


        Printer<String, Integer> printer = new Printer<>();

        printer.addToList("five");
        printer.addToList("six");
        printer.addToList("seven");

        printer.addToList2(5);


        printer.printList();
        printer.printList2();


        Printer<Boolean, String> printer2 = new Printer<>();

        printer2.addToList(true);
        printer2.addToList(true);
        printer2.addToList(false);

        printer2.addToList2("correct!");
        printer2.addToList2("wrong!");

        printer2.printList();
        printer2.printList2();

    }
}
