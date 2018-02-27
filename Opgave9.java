package Kap11Exercise9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Opgave9
{
    /*
     Write a method hasEven that accepts a set of integers as
     a parameter and returns true if the set contains at least one even integer
     and false otherwise. If passed the empty set, your method should return false.
    */

    public static void main(String[] args)
    {
        Set<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(1);
        setOfIntegers.add(3);
        setOfIntegers.add(5);
        setOfIntegers.add(7);
        setOfIntegers.add(9);
        setOfIntegers.add(11);
        setOfIntegers.add(13);
        setOfIntegers.add(10);

        System.out.println(hasEven(setOfIntegers));
    }


    public static boolean hasEven(Set<Integer> integerSet)
    {
        boolean isItEven = true;
        Iterator<Integer> iterator1 = integerSet.iterator();
        while(iterator1.hasNext())
        {
            if (iterator1.next() % 2 == 0)
            {
                return isItEven;
            }
        }
        isItEven = false;

        return isItEven;
    }

}
