import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Luffy");
        linkedList.add("Zoro");
        linkedList.add("Sanji");
        linkedList.add(0, "Gol D Roger");

        linkedList.addFirst("Garp");
        linkedList.addLast("Sengoku");

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

        String remove = linkedList.remove(2);
        String first = linkedList.getFirst();
        System.out.println(linkedList);
        String last = linkedList.getLast();
        int index = linkedList.indexOf("Zoro");
        int size = linkedList.size();

        System.out.println(first + " " + last + " ");
        System.out.println(linkedList.indexOf("Luffy"));
    }
}
