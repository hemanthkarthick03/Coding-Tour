import java.util.*;

class Solution {
    public static LinkedList<Integer> sortedArray(int[] a, int[] b) {
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        LinkedList<Integer> list = new LinkedList<>();

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (list.size() == 0 || list.getLast() != a[i])
                    list.add(a[i]);
                i++;
            } else {
                if (list.size() == 0 || list.getLast() != b[j])
                    list.add(b[j]);
                j++;
            }
        }

        while (i < n) {
            if (list.size() == 0 || list.getLast() != a[i])
                list.add(a[i]);
            i++;
        }

        while (j < m) {
            if (list.size() == 0 || list.getLast() != b[j])
                list.add(b[j]);
            j++;
        }

        return list;
    }
}

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8, 10 };

        LinkedList<Integer> sortedList = Solution.sortedArray(a, b);

        System.out.println("Merged Sorted Array:");
        for (Integer num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
