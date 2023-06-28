from collections import Counter

class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1)!=len(word2):
            return False
        
        freq1 = Counter(word1)
        freq2 = Counter(word2)
        
        if sorted(freq1.keys()) != sorted(freq2.keys()):
            return False

        if sorted(freq1.values()) != sorted(freq2.values()):
            return False

        return True
    
ob1 = Solution()
nums="abbzzca"
nums1="babzzcz"
result=ob1.closeStrings(nums,nums1)
print(result)