class Solution:
    
    def totalEater(self, piles, mid):
        
        curEating = 0
        for i in range(len(piles)):
            curEating += (piles[i] + mid - 1) // mid
        
        return curEating

    
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        
        low = 1
        high = max(piles)
        res = 0
        

        while(low <= high):
            mid = (low + high) // 2

            if self.totalEater(piles, mid) > h:
                low = mid + 1
            else:
                res = mid
                high = mid - 1
        
        return res
            