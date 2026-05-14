class Solution:
    
    def binSearch(self, nums, target, leftSearch):
        
        low = 0
        high = len(nums) - 1
        idx = -1 

        while(low <= high):
            mid = (low + high) // 2

            if(nums[mid] < target):
                low = mid + 1
            elif(nums[mid] > target):
                high = mid - 1
            else:
                idx = mid
                if leftSearch:
                    high = mid - 1
                else:
                    low = mid + 1
        
        return idx
                
    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        lb = self.binSearch(nums, target, True)
        ub = self.binSearch(nums, target, False)

        return [lb,ub]
