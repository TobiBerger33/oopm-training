package Farm;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main
{
    public static void main(String[] args)
    {
        Animal cat = new Cat("Fred", 2, "balck");
        Animal dog = new Dog("Wauzi", 7, 30);

        Farm farm = new Farm(5);
        Farm farm2 = new Farm(5);

        Cat cat2 = new Cat(dog);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date + " " + time);


    }


}