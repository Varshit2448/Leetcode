class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        freq = {}
        dups = []

        for i in nums:
            freq[i] = freq.get(i,0) + 1
        
        for i,j in freq.items():
            if j > 1:
                dups.append(i)
        
        return dups