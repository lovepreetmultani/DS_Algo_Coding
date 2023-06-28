from typing import List

class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        i = 0
        K = 1
        res = 0
        for j in range(len(nums)):
            if nums[j] == 0:
                K-=1
            while i < len(nums) and K < 0:
                if nums[i] == 0:
                    K+=1
                i+=1
            res = max(res,j-i+1)
        return res - 1
    

ob1 = Solution()
nums=[1,1,0,1]
result=ob1.longestSubarray(nums)
print(result)