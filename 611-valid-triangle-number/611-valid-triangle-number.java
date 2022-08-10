class Solution {
    public int triangleNumber(int[] nums) {
        
        int ans =0;
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3)return ans;
        
        for(int i=2;i<n;i++){
            int left=0;
            int r=i-1;
            while(left<r){
                if(nums[left]+nums[r]> nums[i])
                {
                    ans=ans + (r-left);
                    r-- ;
                }
                else{
                    left++;
                }
            }
        }
        return ans ;
        
    }}