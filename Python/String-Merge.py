class Solution(object):
    def mergeAlternately(word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        merged_string = ""
        max_length = max(len(word1), len(word2))
        for i in range(max_length):
            if i < len(word1):
                merged_string += word1[i]
            if i < len(word2):
                merged_string += word2[i]
        return merged_string

    result = mergeAlternately("abc","pqr")
    print('merged string is:',result)
