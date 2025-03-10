class Solution {
    public int[] sortArrayByParity(int[] nums) {
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

        for(int i = 0 ; i < even.size() ; i++){
            result[i] = even.get(i);
        }

        int remains = even.size();

        for(int i = 0 ; i < odd.size() ; i++){
            result[remains + i] = odd.get(i);
        }

        return result;
    }
}