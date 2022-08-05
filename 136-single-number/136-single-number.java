class Solution {
    public int singleNumber(int[] nums) {
  
        int temp=0;
        for(int i=0;i<nums.length;i++){
            
            // using XOR property
             temp^=nums[i];
        }
        return temp;
        
    }
}