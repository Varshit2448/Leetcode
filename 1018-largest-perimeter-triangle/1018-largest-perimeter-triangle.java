class Solution {
    public int largestPerimeter(int[] nums) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            int min_idx = i;
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[min_idx] > nums[j]){
                    min_idx = j;
                }
            }
            
            int temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;

        }

        int n = nums.length;
        for(int i = n - 1 ; i >= 2 ; i--){
            if(nums[i] < nums[i - 1] + nums[i - 2]){
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}