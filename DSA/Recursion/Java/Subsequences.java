import java.util.*;

class Subsequences {

    public static ArrayList<String> generateSubsequences(char[] arr) {
        ArrayList<String> subsequences = new ArrayList<>();
        subsequence(0, arr.length, new StringBuilder(), subsequences, arr);
        return subsequences;
    }

    public static void subsequence(int in, int len, StringBuilder sb, List<String> lst, char[] arr) {
        if (in == len) {
            lst.add(new String(sb));
            return;
        }
        // Add current element to the subsequence
        subsequence(in + 1, len, sb, lst, arr);
        sb.append(arr[in]);
        // Do not add current element to the subsequence
        subsequence(in + 1, len, sb, lst, arr);
        sb.deleteCharAt(sb.length() - 1); // backtrack
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Generate all subsequences
        List<String> subsequences = generateSubsequences(chars);
        System.out.println("Subsequences:");
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
}