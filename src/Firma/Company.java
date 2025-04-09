package Firma;

import java.util.*;

public class Company
{
    private String name;
    private Developer[] developers;
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
            }
        }

        for(Developer dev : developerList)
        {
            dev.startWorking();
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

    }
}
