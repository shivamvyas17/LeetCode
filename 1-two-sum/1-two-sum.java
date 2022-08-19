class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length-1;
        int[] arr=new int[2];
        int s=0;
        int e=1;
        while(s!=n){
            if(nums[s]+nums[e]==target){
                arr[0]=s;
                arr[1]=e;
                return arr;
            }
            if(e==n){
                s++;
                e=s;
            }
           
            e++;
        
        }
        return arr;   
    }
}