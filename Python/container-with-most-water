class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxArea=0
        left=0
        right=len(height)-1
        while(left<right):
                area=(right-left) * min(height[left], height[right])
                if(area>maxArea):
                     maxArea=area
                if(height[left]<height[right]):
                    left+=1
                else:
                    right-=1

        return maxArea
ob1 = Solution()
nums = [1,8,6,2,5,4,8,3,7]
result=ob1.maxArea(nums)
print(result)
