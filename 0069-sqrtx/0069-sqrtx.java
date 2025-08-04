class Solution {
    public int mySqrt(int x) {
        
        if(x == 1){
            return 1;
        }
        
        int h = (Integer) x / 2;
        int l = 0;
        int ans = 0;
        while(h >= l){
            int mid = l + (h - l)/2;
            if((double)mid * mid == x){
                return mid;
            }

            else if((double)mid * mid > x){
                h = mid - 1;
            }

            else{
                ans = mid;
                l = mid + 1;
            }

        }

        return ans;
    }
}