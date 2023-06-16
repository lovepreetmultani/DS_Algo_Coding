
class Solution(object):
    def kidsWithCandies(candies, extraCandies):
        maxCandies=max(candies)
        for i in range(len(candies)):
            if candies[i] + extraCandies >= maxCandies:
                candies[i]=True
            else:
                candies[i]=False

        return candies
    
    candies = [4,2,1,1,2]
    result = kidsWithCandies(candies,1)
    print('final result in array is:',candies)