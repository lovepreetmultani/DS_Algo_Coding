""" The code works by first creating a stack object. Then, the code iterates through the asteroids array. 
If the current asteroid is positive, the code pushes it onto the stack. If the current asteroid is negative, 
the code checks if the top element on the stack is positive. If it is, the code pops the top element from 
the stack and adds the two asteroids together. If the sum of the two asteroids is less than or equal to 0,
then the two asteroids collide and are removed from the stack. Otherwise, the current asteroid is pushed onto the stack. """
from typing import List

class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack=[]
        for i in asteroids:
            while stack and i < 0  and stack[-1] > 0:
                difference = i + stack[-1]
                if difference < 0:
                    stack.pop()
                elif difference > 0:
                    i=0
                else:
                    i=0
                    stack.pop()
            if i:
                stack.append(i)                
                
        return stack

ob1 = Solution()
nums=[5,10,-5]
result=ob1.asteroidCollision(nums)
print(result)