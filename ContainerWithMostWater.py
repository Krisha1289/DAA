class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max_area = 0
        
        while left < right:
            # Calculate the area formed by the current pair of lines
            current_area = min(height[left], height[right]) * (right - left)
            # Update the maximum area if needed
            max_area = max(max_area, current_area)
            
            # Move the pointer corresponding to the shorter line inward
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return max_area