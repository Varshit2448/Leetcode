class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int i : nums){
            
            /*String str = String.valueOf(i);*/
            int lenOfDigs = (int)(Math.log10(i) + 1);
            if((lenOfDigs % 2) == 0){
                cnt++;
            }
        }
        
        return cnt;
    }
}