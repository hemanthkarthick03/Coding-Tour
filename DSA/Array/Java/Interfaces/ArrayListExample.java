import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Trick 1: ArrayList declaration and initialization with diamond operator
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Printing elements using enhanced for loop
        System.out.println("Elements in the list:");
        for (String item : list) {
            System.out.println(item);
        }

        // Getting the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Removing an element from the list
        list.remove("Banana");

        // Checking if the list contains an element
        boolean containsOrange = list.contains("Orange");
        System.out.println("Does the list contain Orange? " + containsOrange);

        // Creating a sublist
        List<String> sublist = list.subList(0, 1);
        System.out.println("Sublist: " + sublist);

        // Trick 2: Initialize ArrayList with initial capacity
        ArrayList<String> fruits = new ArrayList<>(10);

        // Trick 3: Use toArray() method to convert ArrayList to array
        String[] array = list.toArray(new String[0]);

        // Trick 4: Use removeAll() method to remove all elements that are contained in
        // another collection
        list.removeAll(sublist);
        System.out.println("List after removing sublist: " + list);

        // Trick 5: Use clear() method to clear all elements from the list
        fruits.clear();
        System.out.println("Cleared fruits list: " + fruits);
    }
}
