package Firma;

import java.util.ArrayList;
import java.util.List;

public class Printer<T, E>
{
    private List<T> anyList = new ArrayList<>();
    private List<E> anyList2 = new ArrayList<>();


    public Printer()
    {

    }

    public void addToList(T item)
    {
        anyList.add(item);
    }

    public void addToList2(E item)
    {
        anyList2.add(item);
    }

    public void printList()
    {
        anyList.stream().forEach((n) -> System.out.println(n));
    }

    public void printList2()
    {
        anyList2.stream().forEach((n) -> System.out.println(n));
    }


}