
class Solution {
    public boolean isHappy(int number) {
        int slow = number;
        int fast  = number;
        
        do{
            slow=square(slow);
            fast = square(square(fast));
        }while(slow!=fast);
         
            if(slow == 1){
                return true;
            }
        return false;
    }
     public int square(int number){
        int ans = 0;
        
        while(number > 0){
            int rem =  number %10;
            ans = ans + (rem * rem);
            number /=10;
        }
        return ans;
    }
}