#include <algorithm>
#include <iostream>
#include <iterator>
#include <queue>
#include <vector>
#include <deque>
#include <stack>
#include <list>

int main()
{
    std::cout << std::endl;

    std::vector<int> myVec{0, 0, 1, 1, 2, 2, 3, 4, 4, 5, 3, 6, 7, 8, 1, 3, 3, 8, 8, 9};

    // Unique Elements
    std::vector<int>::iterator newEnd = std::unique(myVec.begin(), myVec.end());

    for (std::vector<int>::iterator it = myVec.begin(); it != newEnd; ++it)
        std::cout << *it << " ";

    std::cout << std::endl;

    std::cout << *next(myVec.begin(), 3) << " " << *prev(myVec.end(), 2);
    return 0;

    std::cout << "\n";

    // List
    std::cout << "List";

    std::cout << "\n";
    std::list<int> list1 = {1, 2, 3};
    std::list<int> list2 = {4, 5, 6};

    for (std::list<int>::iterator i = list1.begin(); i != list1.end(); ++i)
        std::cout << *i << " ";
    std::cout << "\n";

    for (std::list<int>::iterator i = list2.begin(); i != list2.end(); ++i)
        std::cout << *i << " ";
    std::cout << "\n";

    std::cout << "\n";

    auto it = list1.begin();
    std::advance(it, 2);
    list1.splice(it, list2);

    for (std::list<int>::iterator i = list1.begin(); i != list1.end(); ++i)
        std::cout << *i << " ";
    std::cout << "\n";

    for (std::list<int>::iterator i = list2.begin(); i != list2.end(); ++i)
        std::cout << *i << " ";
    std::cout << "\n";

    // Deque - Reverse
    std::cout << "Deque";
    std::cout << "\n";

    std::deque<int> myDeque = {1, 2, 3, 4, 5};
    std::reverse(myDeque.begin(), myDeque.end());

    for (int i : myDeque)
        std::cout << i << " ";

    std::cout << "\n\n";

    // Stack
    std::cout << "Stack";

    std::vector<int> vec = {1, 2, 3};
    std::stack<int, std::vector<int>> myStack(vec);

    myStack.push(5);
    myStack.push(10);
    myStack.pop();

    std::cout << "\n";
    myStack.push(7);
    std::cout << myStack.top() << "\nisEmpty " << myStack.empty();

    while (!myStack.empty())
    {
        myStack.pop();
    }

    std::cout << " " << myStack.empty() << " " << myStack.size();
    std::cout << "\n";

    // Queue
    std::cout << "\nQueue\n";

    std::deque<int> deque = {1, 2, 3};
    std::queue<int, std::deque<int>> myQueue(deque);

    myQueue.push(5);
    myQueue.push(10);
    myQueue.push(3);
    myQueue.push(6);
    myQueue.pop();

    std::cout << myQueue.front() << " " << myQueue.back() << "\nEmpty - " << myQueue.empty();

    // Clear Queue
    while (!myQueue.empty())
        myQueue.pop();
}