class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    return [i,j]
        return[]

    
    
if __name__=='__main__':  
    nums=[3,2,4]
    target=6
    s=Solution()
    print(s.twoSum(nums,target))  