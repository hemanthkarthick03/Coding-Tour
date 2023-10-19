'''
Backspace String Compare - https://leetcode.com/problems/backspace-string-compare/

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
'''


class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        s1 = []
        s2 = []

        for i in s:
            if i != '#':
                s1.append(i)
            else:
                if len(s1):
                    s1.pop()

        for i in t:
            if i != '#':
                s2.append(i)
            else:
                if len(s2):
                    s2.pop()

        return s1 == s2


x = Solution()
print(x.backspaceCompare('aa#', 'ab#'))
