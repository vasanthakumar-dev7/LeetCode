import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=1){
            return nums.length;
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) freq.put(num, 0);
        int maxi = 0;
        for(int element : freq.keySet()){
            int count = 0;
            if(!freq.containsKey(element-1)){
                while(freq.containsKey(element+1)){
                    element = element+1;
                    count++;
                }
            }
            maxi = Math.max(count+1, maxi);
        }
        return maxi;
    }
}