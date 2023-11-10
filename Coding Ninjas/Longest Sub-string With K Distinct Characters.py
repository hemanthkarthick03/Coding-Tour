# https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118626/offering/1377986?leftPanelTab=0
'''
You are given a string ‘S’ of length ‘N’ consisting of lowercase English alphabet letters. You 
are also given a positive integer ‘K’. Now, a substring of this string is good if it contains at most 
'K’ distinct characters. A string ‘X’ is a substring of string ‘Y’ if it can be obtained by 
deletion of several (zero) continuous elements (possibly zero) from the beginning and the end of string 
‘Y’. Your task is to return the maximum size of any good substring of the string ‘S’. 


Sample Input 1:
2
2
abcbc
1
abccc
Sample Output 1:
4
3
Explanation For Sample Input 1:
For the first test case :
K = 2, so we can choose substring “bcbc” having 2 distinct character which is less than or equal to K = 2. 

We cannot get any other substring of length 5 or more having distinct characters less than or equal to 2. Thus, you should return ‘4’ as the answer.

For the second test case :
K = 1, so we can choose substring “ccc” having only 1 distinct character which is less than or equal to K = 1. 

We cannot get any other substring of length 4 or more having distinct characters less than or equal to 1. Thus, you should return ‘3’ as the answer.
'''

S = 'abcbc'
K = 1
max_length = 0
char_count = {}
left = 0

for right in range(len(S)):
    char_count[S[right]] = char_count.get(S[right], 0) + 1

    while len(char_count) > K:
        char_count[S[left]] -= 1
        if char_count[S[left]] == 0:
            del char_count[S[left]]
        left += 1

    max_length = max(max_length, right - left + 1)

print(max_length)
