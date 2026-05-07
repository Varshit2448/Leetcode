class Solution {
    public int maximumWealth(int[][] mat) {
    int highWealth = Integer.MIN_VALUE;
        int currWealth = 0;
        int stakeholder = 0;
        int curholder = 0;


        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                currWealth += mat[i][j];
                curholder = i;
            }

            if(currWealth > highWealth){
                highWealth = currWealth;
                stakeholder = curholder;
            }
            currWealth = 0;
        }
        
        return highWealth;
    }
}