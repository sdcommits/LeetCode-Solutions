class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[0];

        for(int i = 1;i<n;i++){
            a ^= nums[i];
        }
        return a;
        
                
            
       
        
    }
}
