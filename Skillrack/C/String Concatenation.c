/*
Accept two string values S1 and S2 as the input. The program must 
concatenate S2 and S1. Finally, the program must print the concatenated 
string as the output in C program without built in libraries

Input :
    hemanth
    karthick

Output:
    hemanthkarthick
*/

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i,j;
    char str1[101], str2[101], result[201];
    scanf("%s\n%s",str1,str2);
    
    for (i=0;str2[i]!='\0';i++)
        result[i]=str2[i];
        
    for (j=0;str1[j]!='\0';j++)
        result[i+j]=str1[j];
    
    result[i+j]='\0';
    
    printf("%s",result);
}