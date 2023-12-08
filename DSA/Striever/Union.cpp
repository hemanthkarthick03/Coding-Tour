
#include <bits/stdc++.h>

using namespace std;

set<int> FindUnion(int arr1[], int arr2[], int n, int m)
{
  set<int> s;
  for (int i = 0; i < n; i++)
    s.insert(arr1[i]);
  for (int i = 0; i < m; i++)
    s.insert(arr2[i]);

  return s;
}

int main()

{
  int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  set<int> Union = FindUnion(arr1, arr2, n, m);
  cout << "Union of arr1 and arr2 is  " << endl;
  for (auto &val : Union)
    cout << val << " ";
  return 0;
}
