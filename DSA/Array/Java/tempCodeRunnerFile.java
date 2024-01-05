import java.util.*;

class Main {
  public static void Rotatetoleft(int[] nums, int n, int k) {
    k %= n;
    reverse(nums, 0, n - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, n - 1);
    }
  }
  public static void main(String args[]) {
    int n = 7;
    int[] nums = {1,2,3,4,5,6,7};
    int k = 2;
    Rotatetoleft(nums, n, k);
    System.out.println("After Rotating the elements to left ");
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}