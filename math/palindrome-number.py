class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        a = str(x)
        b= a[::-1]
        if(a==b):
            return True
        else:
            return False