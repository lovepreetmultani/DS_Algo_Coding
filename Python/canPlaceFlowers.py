class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        count=0
        for i in range(len(flowerbed)):
            if(flowerbed[i]==0) and (i==0 or flowerbed[i-1]==0
            and (flowerbed[i+1]==0 or i==len(flowerbed)-1)):
                #flowerbed[i]=1
                count+=1
            if(count>=n):
                return True

        return False
    
ob1 = Solution()
arr=[1,0,0,0,1]
result=ob1.canPlaceFlowers(arr,1)
result1=ob1.canPlaceFlowers(arr,2)
print(result)
print(result1)

