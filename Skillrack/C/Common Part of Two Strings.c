/*
Accept two strings S1 and S2 as input. The last part of S1 and the
first part of S2 are equal. The program must print the common part
of two strings as the output.

Example Input/Output: Input: bakerycake cakeshop Output: cake
*/
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int isMatchFound(char str1[], char str2[], int s1Index, int s2Index)
{
    // Compare the last part of the first string and the first part of the second string
    while (str1[s1Index] != '\0')
    {
        if (str1[s1Index] != str2[s2Index])
        {
            return 0;
        }
        s1Index++;
        s2Index++;
    }
    return 1;
}

int main()
{
    char str1[101], str2[101];
    scanf("%s %s", str1, str2);

    int s1Index = strlen(str1), s2Index = 0, s1StartIndex = 0;

    while (s1Index >= 0)
    {
        if (isMatchFound(str1, str2, s1Index, s2Index) == 1)
        {
            // Store the index and check for a larger match again
            s1StartIndex = s1Index;
        }
        s1Index--;
    }

    printf("%s", &str1[s1StartIndex]);

    return 0;
}
