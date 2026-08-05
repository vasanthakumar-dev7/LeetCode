public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(freq.get(complement)!=null){
                res[0] = freq.get(complement);
                res[1] = i;
                break;
            }
            freq.put(nums[i], i);
        }
        return res;
    }
}