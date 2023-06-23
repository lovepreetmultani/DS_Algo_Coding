from typing import List

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        mapper = {}
        for i in range(len(arr)):
            if arr[i] in mapper:
                mapper[arr[i]]+=1
            else:
                mapper[arr[i]]=1
        
        for i in mapper.values():
            return len(set(mapper.values())) == len(mapper.values())
    
ob1 = Solution()
nums=[1,2,2,1,1,3]
result=ob1.uniqueOccurrences(nums)
print(result)