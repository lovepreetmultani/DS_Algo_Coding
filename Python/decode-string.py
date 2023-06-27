class Solution:
    def decodeString(self, s: str) -> str:
        stack=[]
        for i in range(len(s)):
            if s[i]!="]":
                stack.append(s[i])
            else:
                subString=""
                while stack[-1]!="[":
                    subString+=stack.pop()
                stack.pop() #to remove open bracket

                index=""
                while stack and stack[-1].isdigit():
                    index+=stack.pop()
                
                stack.append(int(index) * subString)

        return "".join(stack)

ob1 = Solution()
s = "3[a]2[bc]"
s1 = "3[a2[c]]"
s2 = "2[abc]3[cd]ef"
result=ob1.decodeString(s)
result1=ob1.decodeString(s1)
result2=ob1.decodeString(s2)
print(result)
print(result1)
print(result2)



                
