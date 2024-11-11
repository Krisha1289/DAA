class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        current_sum = nums[0]  # The first element starts the subarray
        max_sum = nums[0]      # Start by assuming the first element is the max
        
        # Iterate through the array starting from the second element
        for num in nums[1:]:
            # Update current_sum to either the current element itself or the current element + current_sum
            current_sum = max(num, current_sum + num)
            
            # Update max_sum if current_sum is larger
            max_sum = max(max_sum, current_sum)
        
        return max_sum