/*
Accept a string S and a character C as the input. The program must print 
the string S by removing the characters until C as the output. 

Boundary Condition(s): 1 <= Length of S <= 100 

Example Input/Output: 
    Input: Good_Morning _ 
    Output: Morning
*/

#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str1[1001],ch;
    scanf("%[^\n]\n%c",&str1,&ch);
    int len,index=0;
    
    while (str1[index]!='\0' && str1[index]!=ch)
        index++;
    
    printf("%s",&str1[index+1]);
}