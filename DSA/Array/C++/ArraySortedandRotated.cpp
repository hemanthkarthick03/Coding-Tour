// 1752. Check if Array Is Sorted and Rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

#include <iostream>
using namespace std;

bool check(int nums[], int n)
{

  int count = 0;

  for (int i = 0; i < n; i++)
  {
    if (nums[i] > nums[(i + 1) % n])
      count++;
  }

  return count <= 1;
}

int main()
{
  int n = 7;
  int nums[] = {7, 1, 2, 3, 4, 5, 6};
  int k = 2;

  cout << (check(nums, n) ? "Yes" : "No");

  return 0;
}