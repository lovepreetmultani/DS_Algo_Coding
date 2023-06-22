class solution:
    def longestOnes(self,nums:list[int],k:int) -> int:
        i=0
        max_count=0
        for j in range(len(nums)):
            if nums[j] == 0:
                k-= 1
            while k < 0:
                if nums[i] == 0:
                    k+= 1
                i += 1
            else:
                max_count = max(max_count, j - i + 1)

        return max_count
    
ob1 = solution()
nums=[1,1,1,0,0,0,1,1,1,1,0]
nums1 = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1]
k = 2
k1 = 3
result=ob1.longestOnes(nums,k)
result1=ob1.longestOnes(nums1,k1)
print(result)
print(result1)