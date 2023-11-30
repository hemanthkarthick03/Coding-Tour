#include <bits/stdc++.h>

int main()
{
    std::unordered_set<int> s;
    for (int i = 1; i <= 10; i++)
    {
        s.insert(i);
    }

    std::cout << "Elements present in the unordered set: ";
    for (auto it = s.begin(); it != s.end(); it++)
    {
        std::cout << *it << " ";
    }
    std::cout << "\n";
    int n = 2;
    if (s.find(n) != s.end())
        std::cout << n << " is present in unordered set"
                  << "\n";

    s.erase(2);
    std::cout << "Elements after deleting the first element: ";
    for (auto it = s.begin(); it != s.end(); it++)
    {
        std::cout << *it << " ";
    }

    std::cout << "\n";

    std::cout << "The size of the unordered set is: " << s.size() << "\n";

    if (s.empty() == false)
        std::cout << "The unordered set is not empty "
                  << "\n";
    else
        std::cout << "The unordered set is empty"
                  << "\n";
    s.clear();
    std::cout << "Size of the unordered set after clearing all the elements: " << s.size();
}