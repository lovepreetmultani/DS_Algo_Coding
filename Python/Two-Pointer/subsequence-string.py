class Solution(object):
    def isSubsequence(self, s, t):
        i=0
        j=0

        while i < len(s) and j < len(t):
            if s[i]==t[j]:
                i+=1

            j+=1

        if i==len(s):
            return True

        return False
    
ob1 = Solution()
result=ob1.isSubsequence("abc","ahbgdc")
result1=ob1.isSubsequence("axc","ahbgdc")
print(result)
print(result1)