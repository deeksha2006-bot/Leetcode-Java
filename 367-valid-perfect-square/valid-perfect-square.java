class Solution {
    public boolean isPerfectSquare(int num) {
       long low=0;
        long high=num;
        while(low<=high)
        {
            long mid=(low+high)/2;
            long mids=mid*mid;
            if(mids==num)
            {
                return true;
            }
            else if(mids<num)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}