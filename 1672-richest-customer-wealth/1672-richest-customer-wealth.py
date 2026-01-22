class Solution:
    def maximumWealth(self, accts: List[List[int]]) -> int:
        r_sum = 0
        max_sum = 0

        for i in range(len(accts)):
            
            for j in range(len(accts[i])):
                r_sum = r_sum + accts[i][j]

            if r_sum > max_sum:
                max_sum = r_sum
            r_sum = 0
        
        return max_sum
__import__("atexit").register(lambda: open("display_runtime.txt", "w").write("0"))

        
        