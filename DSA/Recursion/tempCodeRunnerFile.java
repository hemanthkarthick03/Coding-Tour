import java.util.*;

class subsequence1{
    public String str = "abc";

    public static ArrayList<String> subSeq(String str){
        ArrayList<ArrayList<String>> lst = new ArrayList<>();
        int n = str.length();
        backtrack(0, n, new ArrayList<>(), lst);
    }

    public static void backtrack(int in, int n, ArrayList<String> arr, ArrayList<ArrayList<String>> lst){
        if(in == n){
            lst.add(new ArrayList<>(arr));
            return;
        }
        backtrack(in + 1, n, arr, lst);
        arr.add(str.charAt(in));
        backtrack(in + 1, n, arr, lst);
        arr.remove(arr.size() - 1);
    }
}