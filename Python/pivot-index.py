from typing import List

class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total=sum(nums)
        prev_sum=0
        for i in range(len(nums)):
            if prev_sum==total-prev_sum-nums[i]:
                return i
            prev_sum+=nums[i]

        return -1
    
ob1 = Solution()
nums=[1,7,3,6,5,6]
nums1=[1,2,3]
nums2=[2,1,-1]
result=ob1.pivotIndex(nums)
result1=ob1.pivotIndex(nums1)
result2=ob1.pivotIndex(nums2)
print(result)
print(result1)
print(result2)