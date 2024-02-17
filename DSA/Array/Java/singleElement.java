import java.util.*;

public class singleElement {
    public static int getSingleElement(int[] arr) {
        // size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        // This line will never execute
        // if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}

// --------------------------------------------------------------------------------

/*
 * import java.util.*;
 * 
 * public class {
 * public static int getSingleElement(int []arr) {
 * //size of the array:
 * int n = arr.length;
 * 
 * // XOR all the elements:
 * int xorr = 0;
 * for (int i = 0; i < n; i++) {
 * xorr = xorr ^ arr[i];
 * }
 * return xorr;
 * }
 * 
 * public static void main(String args[]) {
 * int[] arr = {4, 1, 2, 1, 2};
 * int ans = getSingleElement(arr);
 * System.out.println("The single element is: " + ans);
 * 
 * }
 * }
 */