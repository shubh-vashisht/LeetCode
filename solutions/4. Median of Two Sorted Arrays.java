class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] nums3 = new int[len];
        int i=0;
        int j=0;
  int k=0;
       while(i<nums1.length||j<nums2.length){
           if(i==nums1.length){
               nums3[k]=nums2[j];
                k++;
                j++;
           }else if(j==nums2.length){
               nums3[k]=nums1[i];
                k++;
                i++;
           }else if(nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                k++;
                i++;
            }else{
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
     
        if(nums3.length%2==0){
            int a = nums3.length/2;
            int b = (nums3.length-1)/2;
            double c = (double)(nums3[a]+nums3[b])/2;
            return c;
        }else{
            int a = nums3.length/2;
            double b = nums3[a];
                return b;
        }
    }
}
