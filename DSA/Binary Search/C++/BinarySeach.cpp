#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    std::vector<int> v{1, -2, -3, 5, 4, 9, -2, 3, -1, 7};
    std::vector<int> v1{1, -2, 3, 7};
    std::vector<int> v2{1, -1, 2};

    std::sort(v.begin(), v.end());
    std::sort(v1.begin(), v1.end());
    std::sort(v2.begin(), v2.end());

    // Binary search for specific elements in v
    std::cout << std::binary_search(v.begin(), v.end(), -1) << " " << std::binary_search(v.begin(), v.end(), 3) << "\n";

    // Check if all elements of v1 are in v
    std::cout << std::includes(v.begin(), v.end(), v1.begin(), v1.end()) << "\n";

    // Union of v1 and v2
    std::vector<int> unionResult(v1.size() + v2.size());
    auto itUnion = std::set_union(v1.begin(), v1.end(), v2.begin(), v2.end(), unionResult.begin());
    unionResult.resize(std::distance(unionResult.begin(), itUnion));

    for (auto &num : unionResult)
        std::cout << num << " ";
    std::cout << "\n";

    // Set-Difference between v and v2
    std::vector<int> differenceResult(v.size());
    auto itDifference = std::set_difference(v.begin(), v.end(), v2.begin(), v2.end(), differenceResult.begin());
    differenceResult.resize(std::distance(differenceResult.begin(), itDifference));

    for (auto &num : differenceResult)
        std::cout << num << " ";
    std::cout << "\n";

    // Intersection
    std::vector<int> intersectionResult(std::min(v.size(), v2.size()));
    auto itIntersection = std::set_intersection(v.begin(), v.end(), v2.begin(), v2.end(), intersectionResult.begin());
    intersectionResult.resize(std::distance(intersectionResult.begin(), itIntersection));

    for (auto &num : intersectionResult)
        std::cout << num << " ";

    return 0;
}
