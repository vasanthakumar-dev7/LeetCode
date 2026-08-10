import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int x = n/3;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
            if(res.size() == 2){
                return res;
            }
            if(freq.get(nums[i])>n/3){
                if(!res.contains(nums[i])) res.add(nums[i]);
            }
        }
        
        return res;
    }
}