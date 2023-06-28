from typing import List

class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        max_height=0
        curr_height=0
        for i in range(len(gain)):
            curr_height+=gain[i]
            max_height = max(max_height,curr_height)

        return max_height
      
ob1 = Solution()
nums=[-5,1,5,0,-7]
nums1=[-4,-3,-2,-1,4,3,2]
result=ob1.largestAltitude(nums)
result1=ob1.largestAltitude(nums1)
print(result)
print(result1)