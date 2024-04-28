package itmo.Laba9;

import java.util.*;

public class MyMethodsForCollections
{
    public static List<Object> uniqueObjects (List<Object> list1)
    {
        HashSet<Object> set1 = new HashSet<>();

        for (Object el : list1)
        {
            set1.add(el);
        }

        List<Object> list2 = new ArrayList<Object>();

        for (Object el : set1)
        {
            list2.add(el);
        }

        Collections.sort(list2, Collections.reverseOrder());
        Collections.reverse(list2);

        return list2;
    }

    public static void printList(List<Object> list1)
    {
        for (Object el : list1)
        {
            System.out.println(el);
        }

        System.out.println("");
    }

    public static void addManyIntegerElements (List<Integer> list1)
    {
        for (Integer i = 1; i <= 1000000; i++)
        {
            list1.add(i);
        }
    }

    public static void addManyIntegerElements (LinkedList<Integer> list1)
    {
        for (Integer i = 1; i <= 1000000; i++)
        {
            list1.add(i);
        }
    }

    public static Integer getSomeIntegerElementFrom (List<Integer> list1)
    {
        Random rand = new Random();

        int n = rand.nextInt(list1.size()-1);

        if (n < 0) return null;
        else return list1.get(n);
    }

    public static Integer getSomeIntegerElementFrom (LinkedList<Integer> list1)
    {
        Random rand = new Random();

        int n = rand.nextInt(list1.size()-1);

        if (n < 0) return null;
        else return list1.get(n);
    }

    public static List<Integer> getManySomeIntegerElementsFrom (List<Integer> list1, int n)
    {
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            Integer j = getSomeIntegerElementFrom(list1);
            list2.add(j);
        }

        return list2;
    }

    public static List<Integer> getManySomeIntegerElementsFrom (LinkedList<Integer> list1, int n)
    {
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            Integer j = getSomeIntegerElementFrom(list1);
            list2.add(j);
        }

        return list2;
    }

    public static Integer getPointsFromMapByUsername (Map<User, Integer> map1, String username)
    {
        for (User el : map1.keySet())
        {
            if (el.getName().equals(username)) return map1.get(el);
        }

        return null;
    }

    public static void inputUsernameAndPrintPoints(Map<User, Integer> map1)
    {
        System.out.println("Введите имя пользователя:");

        Scanner scaner = new Scanner(System.in);

        String username = scaner.nextLine();

        Integer rezInt = getPointsFromMapByUsername(map1, username);

        if (null != rezInt)
        {
            System.out.println("Количество очков пользователя " + username + ": " + rezInt);
        }
        else
        {
            System.out.println("Пользователя с именем " + username + " не существует");
        }
    }
}
