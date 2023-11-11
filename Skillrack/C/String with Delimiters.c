/*
Accept a string S as the input. The program must print the given string as shown in the Example Input/Output section.
Example Input/Output:
Input: skillrack123@gmail.com
Output: skillrack123 gmail com
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    char str1[1001], str2[1001], str3[1001];
    scanf("%[^@]@%[^.].%s", str1, str2, str3);
    printf("%s\n%s\n%s", str1, str2, str3);
}