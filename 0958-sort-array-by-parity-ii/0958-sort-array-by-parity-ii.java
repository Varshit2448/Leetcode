class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int num : nums){
            if(num % 2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }

        int[] result = new int[nums.length];

        int j = 0;
        int k = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                result[i] = even.get(j);
                j++;
            }
            else{
                result[i] = odd.get(k);
                k++;
            }
        }

        return result;
    }
}