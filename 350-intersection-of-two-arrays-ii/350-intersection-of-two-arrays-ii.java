class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    
   int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (firstArrayIndex < nums1.length && secondArrayIndex < nums2.length) {
            
            if (nums1[firstArrayIndex] == nums2[secondArrayIndex]) {
                list.add(nums1[firstArrayIndex]);
                firstArrayIndex++;
                secondArrayIndex++;
                
            }
            else if (nums1[firstArrayIndex] < nums2[secondArrayIndex]) {
                firstArrayIndex++;
            }
            else {
                secondArrayIndex++;
            }
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for (int element: list) {
            ans[i] = element;
            i++;
        }
        
        return ans;
    }
}