package Firma;

import java.util.*;
import java.util.stream.Collectors;

public class Company
{
    private String name;
    protected Developer[] developers;
    private List<Developer> developerList = new ArrayList<>();
    private List<Developer> developerLinkedList = new LinkedList<>();
    private Set<Developer> developerHashSet = new HashSet<>();
    private Map<String, String> developerMap = new HashMap<>();


    public Company(int count)
    {
        developers = new Developer[count];
    }


    public void addDev(Developer dev)
    {
        for(int i = 0; i < developers.length; i++)
        {
            if(developers[i] == null)
            {
                developers[i] = dev;
                break;
            }
        }

        developerList.add(dev);
    }

    public void sendToWork()
    {
        for(int i = 0; i < developers.length; i++)
        {
            if(developers[i] != null)
            {
                developers[i].startWorking();
                developers[i].points += 10;
            }
        }

        for(Developer dev : developerList)
        {
            dev.startWorking();
            dev.points += 10;
        }

        developerLinkedList.forEach((developer) -> { developer.startWorking(); });
    }

    public void sortDevList(boolean ascending)
    {
        if(ascending)
        {
            Collections.sort(developerList);
        }
        else
        {
            Collections.sort(developerList, Collections.reverseOrder());
        }



        List<Developer> newDevs = developerLinkedList.stream()
                .filter((developer) -> {return developer.getWorkingYears() > 2;})
                .sorted()
                .toList();


        developerList   .stream()
                        .skip(1)
                        .forEach((developer) -> {
                            System.out.println(developer.getWorkingYears());});


        List<Developer> otherDev = developerList.stream().skip(1).toList();
    }

//    public void print (int value)
//    {
//        System.out.println(value);
//    }
//
//    public void print (double value)
//    {
//        System.out.println(value);
//    }
//
//    public void print (String value)
//    {
//        System.out.println(value);
//    }


    public void changeDevInfo(String name, int workingYears, int index)
    {
        Developer dev = developers[index];

        if(dev != null)
        {
            dev.setName(name);
            dev.setWorkingYears(workingYears);
        }
    }

    public <AnyDataType> void print(AnyDataType value)
    {
        System.out.println(value);
    }
}
