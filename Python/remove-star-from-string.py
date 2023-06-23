class Solution:
    def removeStars(self, s: str) -> str:
        stack = []
        for char in s:
            if char=="*":
                stack.pop()
            else:
                stack.append(char)

        stack_string = "".join(stack)
        return stack_string

ob1 = Solution()
s="leet**cod*e"
s1="erase*****"
result=ob1.removeStars(s)
result1=ob1.removeStars(s1)
print(result)
print(result1)
