class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        cnt = 0
        freq = {}

        for x in nums:
            if x in freq:
                cnt += freq[x]
                freq[x] += 1
            else:
                freq[x] = 1
        
        return cnt
        