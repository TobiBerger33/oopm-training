package Firma;

public class Mitarbeiter implements Comparable<Mitarbeiter>
{
    private int age;

    @Override
    public int compareTo(Mitarbeiter o)
    {
        if(age == o.age)
        {
            return 0;
        }
        else if (age > o.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
