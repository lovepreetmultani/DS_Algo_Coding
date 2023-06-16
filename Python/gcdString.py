import fractions
class Solution(object):
    def gcdOfStrings(str1, str2):
        if str1==str2:
            return str1
        elif len(str2)>len(str1):
            str1, str2 = str2, str1
        elif str1[:len(str2)]!= str2:
            return ""
        else:
            return gcdOfStrings(str1[len(str2):],str2)
    
    result = gcdOfStrings("ABCABC","ABC")
    print('gcd of string is:',result)