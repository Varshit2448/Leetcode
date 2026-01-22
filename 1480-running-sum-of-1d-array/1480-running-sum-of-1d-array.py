class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        s = 0
        arr = []
        for i in range(len(nums)):
            s = s + nums[i]
            arr.append(s)
        
        return arr