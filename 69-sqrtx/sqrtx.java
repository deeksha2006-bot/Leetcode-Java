class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        while(low<=high)
        {
            long mid=(low+high)/2;
            long mids=mid*mid;
            if(mids==x)
            {
                return (int) mid;
            }
            else if(mids<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return (int)high;
    }
}