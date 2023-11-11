/*
Program takes a string as input, counts the occurrences of each character, 
and then prints the characters along with their counts.

Input: alpha
Output: a2 l1 p1 h1
*/
#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str1[101];
    scanf("%s",str1);
    int i=0, alphabets[256]={0};
    
    while(str1[i]!='\0'){
        alphabets[str1[i]]++;
        i++;
    }
    
    for(i=0;i<256;i++){
        if (alphabets[i]>0)
            printf("%c%d ",i,alphabets[i]);
    }
}