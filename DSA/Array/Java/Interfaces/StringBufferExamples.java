import java.util.*;

public class StringBufferExamples {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hemanth");
        System.out.println(buffer);
        System.out.println(buffer.toString());

        System.out.println(buffer.capacity());

        buffer.setCharAt(0, 'h');
        System.out.println(buffer.toString());

        buffer.append(" Karthick");
        System.out.println(buffer.toString());

        buffer.insert(0, 'X');
        System.out.println(buffer.toString());

        buffer.insert(0, "   ");
        System.out.println(buffer.toString());

        System.out.println(buffer.toString().trim());

        System.out.println(buffer.reverse());

        System.out.println(buffer.reverse().toString().trim());
        System.out.println(buffer.indexOf("h", 4));
    }
}
