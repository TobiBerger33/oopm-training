package Files;

import Exeptions.Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FilesTest
{
    List<String> data = new ArrayList<>();
    List<Person> people = new ArrayList<>();


    public void init()
    {
//        data.add("A");
//        data.add("B");
//        data.add("C");
//        data.add("D");
//        data.add("E");
    }

    public void writeToFile()
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt")))
        {
            writer.write("Hello World\n");

            for (String letter : data)
            {
                writer.write(letter + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void readFromFile()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("myfile.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);

                data.add(line);
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void writePersonToFile()
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("people.csv")))
        {
            for (Person person : people)
            {
                writer.write(person.toString() + "\n");
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void readPersonFromFile()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("people.csv")))
        {
            String line = reader.readLine();

            while (line != null)
            {
                String[] personData = line.split(",");

                String name = personData[0];
                int age = Integer.parseInt(personData[1]);
                int id = Integer.parseInt(personData[2]);

                Person newPerson = new Person(name, age, id);

                people.add(newPerson);

                line = reader.readLine();
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    public void printData()
    {
        data.stream().forEach((n) -> System.out.println(n));
    }
}
