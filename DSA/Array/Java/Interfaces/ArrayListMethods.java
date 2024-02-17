import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(10);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        for (Integer it : intList) {
            System.out.println("Element : " + it);
        }

        int size = intList.size();
        System.out.println("Size of the list: " + size);

        boolean isEmpty = intList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        for (int i = 0; i < size; i++) {
            System.out.println(intList.get(i));
        }

        intList.remove(1);
        System.out.println(intList);

        boolean hasTwo = intList.contains(2);
        System.out.println("Does the list contain 2? " + hasTwo);

        // Sublist - Only to List
        List<Integer> subList = intList.subList(1, 3);
        System.out.println(subList);

        intList.remove(0);
        intList.remove(Integer.valueOf(6));
        System.out.println(intList);

        // Adding elements from an array
        Integer[] array = { 40, 50, 60 };
        intList.addAll(List.of(array));
        System.out.println("List after adding elements from array: " + intList);

        // Convert ArrayList to an array
        Integer[] toArray = intList.toArray(new Integer[0]);
        System.out.println("ArrayList converted to array: ");
        for (int item : toArray) {
            System.out.println(item);
        }
    }
}
