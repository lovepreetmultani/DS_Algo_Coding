class Solution(object):
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """
        if len(chars)<=1:
            return
        result=""
        count=1
        i=1
        for i in range(len(chars)-1):
            if chars[i]==chars[i+1]:
                count+=1
            else:
                result+= chars[i]+str(count)
                count=1

        result+= chars[i]+str(count)
        print("final result is:",result,len(result) ,len(chars) )
        if len(result) >= len(chars):
             return ''.join(chars)
        else:
            return ''.join(result)


ob1 = Solution()
chars = ["a","a","b","b","c","c","c"]
result=ob1.compress(chars)
print(result)
