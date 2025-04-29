package Exeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExeptionTest
{
    private int[] anyArray = new int[5];

    public void test(String filename)
    {
        try
        {
            FileReader fileReader = new FileReader(filename);
        }
        catch (FileNotFoundException e)
        {
            System.out.printf("Exeption caught: %s is no valid filename\n", filename);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Finally block");
        }

    }

    public void test(int index) throws MyExeptions
    {
        if (index >= anyArray.length)
            throw new MyExeptions();

    }

}
