class Solution {
    public int maximumWealth(int[][] accts) {
        int max_sum = 0;
        int r_sum = 0;
         

        for(int i = 0 ; i < accts.length ; i++){
            
            for(int j = 0 ; j < accts[i].length; j++){
                r_sum = r_sum + accts[i][j];
            }

            if(r_sum > max_sum){
                max_sum = r_sum;
            }
            r_sum = 0;

        }

        return max_sum;
    }
}