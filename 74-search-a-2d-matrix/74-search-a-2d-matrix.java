class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    
 int row = -1 ;
		 
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][0] < target) {
                row = i;
            } else if(matrix[i][0] == target)
                return true;
        }
		
        if(row < 0) return false;
		
        int left = 0 , right = matrix[row].length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[row][mid] == target) return true;
            if(matrix[row][mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}