#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    std::vector<int> v{5, 6, 5, 1, 2, 3, 57, 8, 85, 2, 4, 2, 1, 4};
    int n = v.size();

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (v.at(j) > v.at(j + 1))
            {
                int temp = v.at(j);
                v.at(j) = v.at(j + 1);
                v.at(j + 1) = temp;
            }
        }
    }

    for (std::vector<int>::iterator it = v.begin(); it != v.end(); ++it)
        std::cout << *it << " ";
}