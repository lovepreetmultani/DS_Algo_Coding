#The enumerate function is used to iterate over a sequence (such as a list or string) 
#while also tracking the index of each element. It returns an iterable object that
#generates pairs of index and value

class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        max_vowels = 0
        current_vowels = 0
        for i,c in enumerate(s):
            if i>=k and s[i-k] in vowels:
                current_vowels-=1
            if c in vowels:
                current_vowels+=1

            max_vowels=max(max_vowels,current_vowels)
        return max_vowels

ob1 = Solution()
s = "abciiidef"
s1 = "leetcode"
k = 3
k1 = 2
result=ob1.maxVowels(s,k)
result1=ob1.maxVowels(s1,k1)
print(result)
print(result1)
