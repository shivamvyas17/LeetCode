class Solution {
    public int missingNumber(int[] nums) {
        
    int n=nums.length;
    int totals=n *(n+1)/2;
    int exp=0;
      
        for(int i=0;i<n;i++){
            
            exp=exp+nums[i];
        }
        return totals-exp;
        
    }
    
}