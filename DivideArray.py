class Solution:
    def isPossibleDivide(self, nums: List[int], k: int) -> bool:
        if len(nums) % k != 0:
            return False
        
        # Create a frequency map of the numbers
        count = Counter(nums)
        
        # Sort the numbers (this helps us pick the smallest number first)
        nums.sort()
        
        # Try to form k consecutive numbers starting from each element
        for num in nums:
            if count[num] > 0:  # If the number is still available to form a sequence
                for i in range(k):
                    if count[num + i] > 0:
                        count[num + i] -= 1  # Use this number for the sequence
                    else:
                        return False  # If any consecutive number is missing, return False
                        
        return True