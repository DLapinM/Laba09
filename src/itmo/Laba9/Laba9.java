package itmo.Laba9;

import java.util.*;

public class Laba9
{
    public static void main(String[] args)
    {
        /** Лаба 9. Упражнение 2. */

        String[] names = {"Вася", "Петя", "Саша", "Маша", "Саша", "Ваня", "Петя"};
        List<Object> myList = new ArrayList<Object>(Arrays.asList(names));

        MyMethodsForCollections.printList(myList);

        List<Object> myListUnique = MyMethodsForCollections.uniqueObjects(myList);

        MyMethodsForCollections.printList(myListUnique);


        /** Лаба 9. Упражнение 3. */

        long start = System.currentTimeMillis();

        List<Integer> listInteger1 = new ArrayList<Integer>();
        MyMethodsForCollections.addManyIntegerElements(listInteger1);
        List<Integer> listIntegerRezult1 = MyMethodsForCollections.getManySomeIntegerElementsFrom(listInteger1, 100000);

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Затраченное время: " + elapsed + " милисекунд");
        /** Затраченное время: 109 милисекунд */

        start = System.currentTimeMillis();

        LinkedList<Integer> listInteger2 = new LinkedList<Integer>();
        MyMethodsForCollections.addManyIntegerElements(listInteger2);
        List<Integer> listIntegerRezult2 = MyMethodsForCollections.getManySomeIntegerElementsFrom(listInteger2, 100000);

        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Затраченное время: " + elapsed + " милисекунд");
        /** Затраченное время: 197978 милисекунд */

        /** Второй вариант дольше, поскольку используется связанный список, а в связанном списке для произвольного
        доступа к элементу придется перебирать элементы по одному до тех пор, пока мы не придем к нужному. */


        /** Лаба 9. Упражнение 4. */

        User user1 = new User("Вася");
        User user2 = new User("Петя");
        User user3 = new User("Саша");
        User user4 = new User("Маша");
        User user5 = new User("Ваня");

        Map<User, Integer> map1 = new HashMap<User, Integer>();

        map1.put(user1, 445);
        map1.put(user2, 554);
        map1.put(user3, 334);
        map1.put(user4, 335);
        map1.put(user5, 554);

        MyMethodsForCollections.inputUsernameAndPrintPoints(map1);
    }
}
