class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int i=0;
        int j=0;
        for(int k=0; k<nums.length; k++){
            if(nums[k] >= 0){
                pos[i++] = nums[k];
            }else{
                neg[j++] = nums[k];
            }
        }
        int[] res = new int[n];
        for(int k=0; k<n; k++){
            if(k%2 == 0){
                res[k] = pos[k/2];
            }else{
                res[k] = neg[k/2];
            }
        }
        return res;
    }
}