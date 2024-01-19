#include <iostream>

using namespace std;

class Solution {
public:
    string removeOuterParentheses(string s) {
        string result = "";
        int count = 0;

        for (char c : s) {
            if (c == '(' && count++ > 0) {
                result += c;
            }
            if (c == ')' && count-- > 1) {
                result += c;
            }
        }

        return result;
    }
};

int main() {
    Solution solution;

    // Test cases
    cout << solution.removeOuterParentheses("(()())(())") << endl;  // Output: "()()()"
    cout << solution.removeOuterParentheses("(()())(())(()())") << endl;  // Output: "()()()()(())"
    cout << solution.removeOuterParentheses("()()") << endl;  // Output: ""

    return 0;
}
