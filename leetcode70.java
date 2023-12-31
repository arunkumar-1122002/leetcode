//this recursive solution take more time for longer input...so to make this effective apply DP
class Solution {
    public int climbStairs(int n) {
        return helper(0,n);
    }
    int helper(int current,int target)
    {
        if(current == target)
        return 1;
        if(current > target)
        return 0;
        int left=helper(current+1,target);
        int right=helper(current+2,target);
        return left+right;
    }
}