class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        def get_mapped_value(num):
            # Convert each digit of num to its mapped value
            mapped_num = ""
            for digit in str(num):
                mapped_num += str(mapping[int(digit)])
            return int(mapped_num)
        
        # Sort nums based on their mapped values using get_mapped_value as the key
        nums.sort(key=lambda x: get_mapped_value(x))
        return nums