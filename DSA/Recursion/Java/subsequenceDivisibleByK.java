import java.util.*;

class subsequenceDivisibleByK {
    public static void printSubsequencesDivisibleByK(int in, int sum, ArrayList<Integer> lst, int[] arr, int n, int k) {
        if (in == n) {
            if (sum % k == 0 && !lst.isEmpty()) {
                for (int i : lst)
                    System.out.print(i + " ");
                System.out.println();
            }
            return;
        }

        printSubsequencesDivisibleByK(in + 1, sum, lst, arr, n, k);

        lst.add(arr[in]);
        printSubsequencesDivisibleByK(in + 1, sum + arr[in], lst, arr, n, k);
        lst.remove(lst.size() - 1); // backtrack to restore original array state.
        return;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, };
        int k = 3;
        int n = arr.length;
        System.out.println("Subsequences divisible by " + k + ": ");
        printSubsequencesDivisibleByK(0, 0, new ArrayList<>(), arr, n, k);
    }
}