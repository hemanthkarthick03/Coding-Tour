import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;

        for (int i : arr)
            totalSum += i;

        long minSum = totalSum - arr.get(0);
        long maxSum = minSum;

        for (int i = 1; i < arr.size(); ++i) {
            long sum = totalSum - arr.get(i);
            if (sum < minSum)
                minSum = sum;
            if (sum > maxSum)
                maxSum = sum;
        }

        System.out.println(minSum + " " + maxSum);
    }
}

public class MiniMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

// Input: 1 2 3 4 5