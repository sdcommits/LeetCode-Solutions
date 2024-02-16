class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        int l;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                l = i;
                break;
            }
            else{
                l = -1;
            }
        }
        return l;
        
    }
};
