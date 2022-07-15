class Solution {
    public int reachNumber(int target) {
        
    
 target = Math.abs(target);
        int sum = findClosestMultiple(target);
        while ((sum * (sum + 1) / 2) % 2 != target % 2) {
            sum++;
        }
        return sum;
    }
    
    public int findClosestMultiple(int target) {
        int b = 1;
        int e = Math.min(target, (int) Math.pow(Integer.MAX_VALUE, 0.5));
        while (b < e) {
            int m = (b + e) / 2;
            int sum = m * (m + 1) / 2;
            b = sum < target ? m + 1 : b;
            e = sum >= target ? m : e;
        }
        return b;
    }
}