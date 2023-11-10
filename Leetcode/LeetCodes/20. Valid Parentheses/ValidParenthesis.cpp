#include <iostream>
#include <string>
#include <stack>
#include <vector>
using namespace std;
class Solution
{
public:
    bool isValid(string s)
    {
        stack<char> st;
        for (auto i : s)
        {
            if (i == '(' or i == '[' or i == '{')
                st.push(i);
            else
            {
                if ((st.empty()) or (st.top() == '[' and i != ']') or (st.top() == '(' and i != ')') or (st.top() == '{' and i != '}'))
                    return false;

                st.pop();
            }
        }
        return st.empty();
    }
};

int main()
{
    Solution s;
    std::cout << s.isValid("(hemesh({}))");
    std::vector<int> v = {1, 2, 3};
    auto i = v.begin();
    std::cout << "byesh";
}