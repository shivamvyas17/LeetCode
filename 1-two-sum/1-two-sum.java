class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
           for(int j=1+i;j<nums.length;j++)
           {
               ans=nums[i]+nums[j];
               if(ans==target)
               {
                 return new int[]{i, j};
               
           }
               
        }
        
    } 
       return new int[]{}; 
}

}