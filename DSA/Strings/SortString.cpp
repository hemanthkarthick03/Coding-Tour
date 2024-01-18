#include <iostream>
#include <string>
#include <algorithm>

int main()
{
    std::string str{"abcdefghi"}, str2{"asdfaghcjkial"};

    // is_sorted(0 - Check the string sorted
    std::cout << std::is_sorted(str.begin(), str.end()) << " ";
    std::cout << std::is_sorted(str2.begin(), str2.end()) << "\n";

    // partial_sort
    std::partial_sort(str2.begin(), str2.begin() + 5, str2.end());
    std::cout << str2 << "\n";

    std::sort(str2.begin(), str2.end());
    std::cout << str2;
}