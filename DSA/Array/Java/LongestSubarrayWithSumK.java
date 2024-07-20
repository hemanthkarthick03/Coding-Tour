public class LongestSubarrayWithSumK {
    public static int longestSubarraySlidingWindow(int[] array, int k) {
        int n = array.length;
        int maxLength = 0;
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += array[end];

            while (currentSum > k && start <= end) {
                currentSum -= array[start];
                start++;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] array1 = { 2, 3, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 }; // Example with non-negative numbers
        System.out.println(longestSubarraySlidingWindow(array1, 5)); // Output: 2
        System.out.println(longestSubarraySlidingWindow(array2, 9)); // Output: 2 (subarray [4, 5])
    }
}
