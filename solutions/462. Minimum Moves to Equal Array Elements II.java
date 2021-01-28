class Solution {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums); 
        int avg = nums[nums.length/2];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>avg){
               count += nums[i]-avg;
            }else if(nums[i]<avg){
                 count += avg-nums[i];
            }
        }
        return count;
    }
}
