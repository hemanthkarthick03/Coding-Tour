'''
31. Next Permutation == Medium
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 
'''
def nextPermutation(nums):
        n = len(nums)
        # Reversing the list when it is less than 2 elements : [1,2] -> [2,1]
        if n<=2:
            return nums.reverse()

        val = n-2   # Second-last element's index of the element
        
        ''' 
        Checks elements are in descending from within the nums array
        [1,2,3,|10,7,5,3|]
        '''
        while (val>=0 and nums[val]>=nums[val+1]): 
            val-=1
        
        # When all elements are arranged in a descending order then reversed !
        if val==-1:
            return nums.reverse()

        # Navigate the first number outside the decreasing order and swap with the number higher than that num at index 'val'
        for i in range(n-1,val,-1):
            if (nums[val] < nums[i]):
                nums[val], nums[i] = nums[i], nums[val]
                break

        # Reverse the modified list
        nums[val+1:] = reversed(nums[val+1:])
        return nums

print(nextPermutation([1,1,5]))