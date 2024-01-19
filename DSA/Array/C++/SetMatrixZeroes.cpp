#include <iostream>
#include <vector>

using namespace std;

void setZeroes(vector<vector<int>> &matrix)
{
    int r = matrix.size();
    int c = matrix[0].size();
    vector<bool> zeroRow(r, false);
    vector<bool> zeroCol(c, false);

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            if (matrix[i][j] == 0)
            {
                zeroRow[i] = true;
                zeroCol[j] = true;
            }
        }
    }

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            if (zeroRow[i] || zeroCol[j])
            {
                matrix[i][j] = 0;
            }
        }
    }
}

int main()
{
    vector<vector<int>> matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

    cout << "Original matrix:\n";
    for (auto row : matrix)
    {
        for (int element : row)
        {
            cout << element << " ";
        }
        cout << "\n";
    }
    cout << "\n";
    setZeroes(matrix);

    cout << "Matrix after setting zeroes:\n";
    for (auto row : matrix)
    {
        for (int element : row)
        {
            cout << element << " ";
        }
        cout << "\n";
    }

    return 0;
}
