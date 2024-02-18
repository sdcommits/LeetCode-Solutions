class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        boolean t = true;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                t = true;
                break;
            }
            else{
                t = false;
            }
        }
        return t;
        
    }
}
