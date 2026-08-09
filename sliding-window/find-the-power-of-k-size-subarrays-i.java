class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        for(int i=0; i<=nums.length-k; i++){
            boolean flag = false;
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k-1; j++){
                if(nums[j]<nums[j+1] && nums[j+1] == nums[j]+1){
                    flag = true;
                    max = Math.max(nums[j], max);
                    max = Math.max(nums[j+1], max);
                }else{
                    flag = false;
                }
            }
            if(flag){
                res[i] = max;
            }else{
                res[i] = -1;
            }
        }
        return res;
    }
}