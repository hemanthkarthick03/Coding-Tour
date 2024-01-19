#include <iostream>
#include <string>

using namespace std;

string addStrings(string num1, string num2)
{
    int carry = 0;
    string result = "";

    // Make sure num1 is not shorter than num2 by swapping
    if (num1.length() < num2.length())
    {
        swap(num1, num2);
    }

    int i = num1.length() - 1;
    int j = num2.length() - 1;

    while (i >= 0 || j >= 0 || carry)
    {
        int x = (i >= 0) ? (num1[i] - '0') : 0;
        int y = (j >= 0) ? (num2[j] - '0') : 0;

        int sum = x + y + carry;
        carry = sum / 10;

        result = to_string(sum % 10) + result;

        i--;
        j--;
    }

    return result;
}

int main()
{
    int T;
    cin >> T;

    for (int t = 0; t < T; ++t)
    {
        string num1, num2;
        /
                cin >>
            num1 >> num2;

        string sum = addStrings(num1, num2);
        cout << sum << endl;
    }

    return 0;
}
