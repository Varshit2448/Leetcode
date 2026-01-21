class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;

        for(int j = 0 ; j < n ; j++){
            arr[i++] = nums[j];
            arr[i++] = nums[j + n];
            
        }
        return arr;
    }
}