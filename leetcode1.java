//two sum-easy-using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ak=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer n=ak.get(nums[i]);
            if(n!= null)
            {
                return new int[]{n,i};
            }
            ak.put(target-nums[i],i);
        }
        return nums;
        
    }
}
