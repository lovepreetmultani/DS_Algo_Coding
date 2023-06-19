class Solution(object):
    def increasingTriplet(self, nums):

        i, j = float('inf'), float('inf')

        for num in nums:
            if num<=i:
                i=num
            elif num<=j:
                j=num
            else:
                return True
        
        return False

ob1 = Solution()
nums = [5,4,3,2,1]
nums1 = [1,2,3,4,5]
nums2 = [2,1,5,0,4,6]
result=ob1.increasingTriplet(nums)
result1=ob1.increasingTriplet(nums1)
result2=ob1.increasingTriplet(nums2)
print(result)
print(result1)
print(result2)
