class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int mini = nums[0];
        int maxi = nums[0];
        for(int i=1; i<nums.length; i++){
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        System.out.println(mini);
        System.out.println(maxi);
        for(int i=mini; i<maxi; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}