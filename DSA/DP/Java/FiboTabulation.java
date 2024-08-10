import java.util.*;

class FiboTabulation {
    public static int fibo(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= num; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[num];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}