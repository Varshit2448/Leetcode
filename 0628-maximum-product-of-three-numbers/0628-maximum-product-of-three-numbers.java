class Solution {
    public int maximumProduct(int[] nums) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            int max_idx = i;
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[max_idx] < nums[j]){
                    max_idx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[max_idx];
            nums[max_idx] = temp;
        }
        int n = nums.length;
        
        return Math.max((nums[0] * nums[1] * nums[2]) , (nums[n - 1] * nums[n - 2] * nums[0]));
    }
}