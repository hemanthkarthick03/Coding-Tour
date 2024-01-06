#include <iostream>
#include <set>

int main(){
    std::set<int> mySet = {4, 2, 6, 1, 5};
    mySet.insert(5);
    mySet.insert(10);

    mySet.erase(6);

    if (mySet.find(3) != mySet.end()) {
        return true;
    }

    mySet.insert(3);
    if (mySet.find(3) != mySet.end()) {
        return true;
    }

    std::cout << mySet.size() << " " << mySet.empty() << " ";
    std::cout << mySet.clear();
}