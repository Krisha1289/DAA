class Solution:
    def longestPalindrome(self, s: str) -> int:
        freq = Counter(s)
        length = 0
        odd_found = False
        
        # Iterate through the frequency counts
        for count in freq.values():
            if count % 2 == 0:
                # If count is even, we can use all of it
                length += count
            else:
                # If count is odd, we use the largest even part of it
                length += count - 1
                odd_found = True
        
        # If there is any odd count, we can place one character in the center
        if odd_found:
            length += 1
        
        return length