import java.util.*;

class FiboTopDown {
    public static int fibo(int num) {
        int[] dp = new int[num + 1];
        Arrays.fill(dp, -1);
        return fiboHelper(num, dp);
    }

    public static int fiboHelper(int num, int[] dp) {
        if (num <= 1)
            return 1;

        if (dp[num] != -1)
            return dp[num];

        dp[num] = fiboHelper(num - 1, dp) + fiboHelper(num - 2, dp);
        return dp[num];
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Fibonacci number at " + num + " is: " + fibo(num));
    }
}