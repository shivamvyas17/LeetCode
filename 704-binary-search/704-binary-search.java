class Solution {
    public int search(int[] nums, int target) {
        
    
 for(int start = 0, end = nums.length - 1, mid = end / 2; start <= end; mid = (start + end) / 2) {
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}