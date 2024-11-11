class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        elif n == 2:
            return 2
        
        # Initialize the first two steps
        first = 1
        second = 2
        
        # Compute the number of ways for each step from 3 to n
        for i in range(3, n + 1):
            current = first + second
            first = second
            second = current
        
        return second