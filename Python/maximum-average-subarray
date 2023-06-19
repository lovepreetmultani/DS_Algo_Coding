class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        currentSum=maxSum=sum(nums[:k])
        for i in range (k,len(nums)):
            currentSum+=nums[i] - nums[i-k]
            maxSum=max(maxSum,currentSum)
        return maxSum/k     

ob1 = Solution()
nums = [1,12,-5,-6,50,3]
nums1 = [5]
k = 4
l = 1
result=ob1.findMaxAverage(nums, k)
result1=ob1.findMaxAverage(nums1, l)
print(result)
print(result1)

