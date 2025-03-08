class Solution {
    public int heightChecker(int[] heights) {
        int[] un_expected = new int[heights.length];
        
        int k = 0;
        for(int h : heights){
            un_expected[k] = h;
            k++;
        }

        Arrays.sort(heights);

        //int j = 0;
        int xp_changes = 0;
        for(int i = 0 ; i < un_expected.length ; i++){
            if(un_expected[i] != heights[i]){
                xp_changes++;
            }
        }

        return xp_changes;
    }
}