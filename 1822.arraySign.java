class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int m = 1, i =0;
        for(final int num : nums){
            if(num == 0){
                return 0;
            }
            if(num<0){
                m = -m;
            }
        }
    return m;
        
        
        
    }
}
