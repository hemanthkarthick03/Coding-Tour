#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    int x;
    std::vector<int> v{1, 2, 5, 4, 2, 9, 3, 2, 1};

    std::cout << "\n";

    int n = v.size();

    for (int i = 0; i < n; i++)
    {
        int j = i;

        while (j > 0 && (v.at(j - 1) >= v.at(j)))
        {
            int temp = v.at(j);
            v.at(j) = v.at(j - 1);
            v.at(j - 1) = temp;
            j--;
        }
    }

    for (std::vector<int>::iterator it = v.begin(); it != v.end(); ++it)
        std::cout << *it << " ";
}