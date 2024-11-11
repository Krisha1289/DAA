class Solution:
    def partition(self, s: str) -> List[List[str]]:
        def is_palindrome(sub: str) -> bool:
            return sub == sub[::-1]
        
        def backtrack(start: int, path: list):
            # If we've reached the end of the string, add the current partition
            if start == len(s):
                result.append(path[:])
                return
            
            # Try all possible substrings starting from 'start'
            for end in range(start + 1, len(s) + 1):
                substring = s[start:end]
                
                # If the substring is a palindrome, recurse for the rest of the string
                if is_palindrome(substring):
                    path.append(substring)
                    backtrack(end, path)
                    path.pop()  # Backtrack
        
        result = []
        backtrack(0, [])
        return result