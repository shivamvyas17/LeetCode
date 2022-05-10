class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[200];
        
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+ nums[i-1];
        }
        return nums;
        
    }
}