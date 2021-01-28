class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[i];
        }
        Arrays.sort(nums2);
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            if(nums2[i]!=nums[i]){
                start =i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums2[i]!=nums[i]){
                end = i;
                break;
            }
        }
        if(start==end){
            return 0;
        }
        return end - start+1;
    }
}
