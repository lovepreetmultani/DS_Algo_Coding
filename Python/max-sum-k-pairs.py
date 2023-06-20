from collections import Counter

class Solution:
    def maxOperations(self, nums, k):
        i=0
        j=len(nums)-1
        count=0
        nums.sort()
        while(i<j):
            if(nums[i]+nums[j]==k):
                count+=1
                i+=1
                j-=1
            elif(nums[i]+nums[j]<k):
                i+=1
            else:
                j-=1
        
        return count
       
ob1 = Solution()
nums = [4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4]
k = 2
result=ob1.maxOperations(nums,k)
print(result)