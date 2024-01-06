// Sorting
#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    std::vector<int> v{1, 2, 3, 45, 6, 4, 7, 4, 5, 5, 1, 21};

    for (std::vector<int>::iterator i = v.begin(); i != v.end(); ++i)
        std::cout << *i << " ";

    std::cout << std::endl;

    int n = v.size();

    for (int i = 0; i < n - 1; i++)
    {
        int minVal = i;

        for (int j = i + 1; j < n; j++)
        {
            if (v.at(minVal) > v.at(j))
                minVal = j;
        }

        int temp = v.at(minVal);
        v.at(minVal) = v.at(i);
        v.at(i) = temp;
    }

    for (std::vector<int>::iterator i = v.begin(); i != v.end(); ++i)
        std::cout << *i << " ";
}