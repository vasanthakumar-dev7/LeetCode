class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==1 && n==0){
            return;
        }else if(m==0 && n==1){
            nums1[0] = nums2[0];
        }
        int i = 0; 
        while(i<m){
            if(nums1[i]>nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
            }
            i++;
        }
        int j = 0;
        while(i<m+n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}