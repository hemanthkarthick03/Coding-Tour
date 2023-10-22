'''
1481. Least Number of Unique Integers after K Removals
Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

 

Example 1:

Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.
Example 2:
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 

'''
arr = [5, 5, 4]
k = 1
count = {i: arr.count(i) for i in arr}
ans = len(count)
for i in sorted(count.values()):
    k -= i
    if k < 0:
        break
    ans -= 1
print(ans)

print(count)

'''
c = Counter(arr) Large DataSet
s = sorted(arr, key=lambda x: (c[x], x))
print(s)
print(len(set(s[k:])))
'''
