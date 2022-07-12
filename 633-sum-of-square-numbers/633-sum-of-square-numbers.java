class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0, e = sqr(c);
    while (s <= e)
    {
        if ((s * s) + (e * e) == c)
        {
            return true;
        }
        else if ((s * s) + (e * e) > c)
        {
            e--;
        }
        else
        {
            s++;
        }
    }
    return false;
}
      static long sqr(int c) 
    {
        long start =0;
        long end =c;
        long ans =1;

        while(start<=end)
        {
            long mid = start +(end-start)/2;
            long square=mid*mid;

            if(square==c)
            {
                return mid;
            }
            if(square<c)
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return  ans;
    }
}

        
    
