/*
The program must accept an integer N as the input. The program must print the desired pattern as 
shown in the Example Input/Output section. 

Boundary Condition(s): 
1 <= N <= 1000 Input Format: 
The first line contains N. 

Output Format: The first N lines contain the pattern as shown in the Example Input/Output section. 
Example Input/Output 1: 
Input: 4
Output: 

********
-******-
--****--
---**---

Input: 7
Output: 

**************
-************-
--**********--
---********---
----******----
-----****-----
------**------

*/

#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        // Print leading spaces
        for (int j = 0; j < i; j++) {
            printf("-");
        }

        // Print asterisks
        for (int j = 0; j < 2 * (N - i); j++) {
            printf("*");
        }

        // Print trailing spaces
        for (int j = 0; j < i; j++) {
            printf("-");
        }

        printf("\n");
    }

    return 0;
}
