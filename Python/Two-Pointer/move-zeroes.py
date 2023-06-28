class Solution(object):
    def moveZeroes(self, nums):
        index = 0 
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[index]=nums[i]
                index+=1
        for i in range(index, len(nums)):
            nums[i]=0
        return nums
    
nums = [0,1,0,3,12]
ob1 = Solution()
ob1.moveZeroes(nums)
print(nums)