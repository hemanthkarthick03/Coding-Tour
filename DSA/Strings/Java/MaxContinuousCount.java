public class MaxContinuousCount {
    public static int maxCount(String s) {
        if (s == null || s.length() == 0)
            return 0;

        char currCharacter = s.charAt(0);
        int currCount = 1;
        int CountMax = 1;

        for (int i = 1; i<s.length(); ++i){
            char ch = s.charAt(i);
            
            if (currCharacter == ch){
                currCount++;
                CountMax = Math.max(CountMax, currCount);
            }
            else {
                currCharacter = s.charAt(i);
                currCount = 1;
            }
        }
        
        return CountMax;
    }

    public static void main(String[] args) {
        System.out.println(maxCount("121111542411112333333333"));
    }
}