class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        rSum = []
        s = 0
        for i in range(len(nums)):
            s += nums[i]
            rSum.append(s)
        
        return rSum;