class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;int max=0;
        for(int num:nums){
            if(num>max)
                max=num;
            sum+=num;
        }
        if(max==nums.length-1)
            return nums.length;
        else
        {
            int acutalSum=(nums.length*(nums.length+1))/2;
            return acutalSum-sum;
        }
    }
}
