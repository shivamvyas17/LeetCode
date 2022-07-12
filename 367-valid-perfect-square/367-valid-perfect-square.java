class Solution {
    public boolean isPerfectSquare(int num) {
        
         long i = 1, end = num;
        if(num == 1)
            return true;
        
        while(i <= end){
            long mid = i + (end - i)/2;
            long value = mid * mid;
            
            if(value == num)
                return true;
            if(value > num)
                end = mid-1;
            else{
                i = mid+1;
            }
        }
        
        return false;
    }
}