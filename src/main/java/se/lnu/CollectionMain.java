package se.lnu;

import se.lnu.Exercise4.ArrayIntList;
import se.lnu.Exercise4.ArrayIntStack;

public class CollectionMain {

    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        System.out.println(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("The list: " + list);
        System.out.println("List size: " + list.size());
        System.out.print("add number 4 at position 2: ");
        list.addAt(4, 2);
        System.out.println(list);
        System.out.print("Remove index 3: ");
        list.remove(3);
        System.out.println(list);
        System.out.print("Get the number of index 2: ");
        System.out.println(list.get(2));
        System.out.println("Find the place of number 4: " + list.indexOf(4));

        ArrayIntStack list1 = new ArrayIntStack();
        System.out.println(list1.isEmpty());
        list1.push(1);
        list1.push(2);
        list1.push(3);
        System.out.println("The list: " + list1);
        System.out.println(list1.pop() + " Popped from list.");
        System.out.println("New size: " + list1.size());
        System.out.println(list1.peek() + " is picked.");

    }

}
