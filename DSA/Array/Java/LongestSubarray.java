import java.util.*;

public class LongestSubarray {
    public static void largestSubarray(ArrayList<Integer> arr, long k) {
        int n = arr.size();
        int i = 0, j = 0;

        for (Integer it : arr) {
            System.out.println(it);
        }
    }

    
    public static void main(String[] args) {
        long k = 9;
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i : arr)
            arrList.add(i);

        LongestSubarray.largestSubarray(arrList, k);
    }
}
