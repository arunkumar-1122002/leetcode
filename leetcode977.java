class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer=new int[nums.length];
        int right=nums.length-1;
        int left=0;
        int index=right;
        while(left<=right){
            int leftNum=nums[left]*nums[left];
            int rightNum=nums[right]*nums[right];
            if(leftNum>rightNum){
                answer[index]=leftNum;
                index--;
                left++;
            }
            else{
                answer[index]=rightNum;
                index--;
                right--;
            }
        }
        return answer;    
    }
}
