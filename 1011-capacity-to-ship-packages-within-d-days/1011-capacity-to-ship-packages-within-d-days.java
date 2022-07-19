class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
    
    int l = getMin(weights);
        int r = getMax(weights);
        int result = 0;
        
        while (l <= r) {
            
            int mid = l + ((r - l) >> 1);
            
            if(isCapacityToShip(weights, days, mid)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return result;
    }
    
    //Max of weights will be our left boundary
    private int getMin(int[] weights) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
        }
        
        return max;
    }
    
    //Sum of all weights and it will be our right boundary
    private int getMax(int[] weights) {
        int sum = 0;
        
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];   
        }
        
        return sum;
    }
    
    
    private boolean isCapacityToShip(int[] weights, int days, int mid) {
        int daysRequired = 1;
        int sum = 0;
        
        for (int i = 0; i < weights.length; i++) {
            if(sum + weights[i] > mid) {
                daysRequired++; // allocate and find new weights for further days
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }
        
        return daysRequired <= days;
    }
}