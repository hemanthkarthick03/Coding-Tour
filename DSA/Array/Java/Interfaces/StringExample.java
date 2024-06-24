import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        String str = new String("Hello World");
        System.out.println(str);

        // Methods
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));

        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));

        System.out.println(str.replace("l", "1"));
        // System.out.println(str.replaceAll("l", "1"));

        String[] str1 = str.split(" ");
        for (String str2 : str1)
            System.out.println(str2);

        // Reversing the string

        System.out.println(str.toUpperCase().equals(str.toLowerCase()));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.contains("World"));

        System.out.println(str.hashCode());
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed + " " + str);
        System.out.println(str.matches(".*Hello.*"));

        float x = 1.4f;
        Float x2 = x;
        // Flat Wrapper Class methods
        System.out.println(x2.intValue());

        int hk = 3;
        System.out.println((double) hk);

        int num = 19648;
        System.out.println("Number : " + num);
        System.out.println(num + " in binary: " +
                Integer.toBinaryString(num));
        System.out.println(num + " in octal: " +
                Integer.toOctalString(num));
        System.out.println(num + " in hexadecimal: " +
                Integer.toHexString(num) + "\n");

        char a[] = { 'a', 'b', '5', '?', 'A', ' ' };
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i]))
                System.out.println(a[i] + " is a digit.");
            if (Character.isLetter(a[i]))
                System.out.println(a[i] + " is a letter.");
            if (Character.isWhitespace(a[i]))
                System.out.println(a[i] + " is whitespace.");
            if (Character.isUpperCase(a[i]))
                System.out.println(a[i] + " is uppercase.");
            if (Character.isLowerCase(a[i]))
                System.out.println(a[i] + " is lowercase.");
            if (Character.isTitleCase(a[i]))
                System.out.println(a[i] + " is Title Case.");

            System.out.println(Character.digit('6', 10));
        }
    }
}