package UnitTests;

public class Noten
{
    public String calculateGrades(int number)
    {
        if(number >= 90)
        {
            return "A";
        }
        else if(number >= 80)
        {
            return "B";
        }
        else if(number >= 70)
        {
            return "C";
        }
        else if(number >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public int add(int a, int b)
    {
        return a + b;
    }
}
