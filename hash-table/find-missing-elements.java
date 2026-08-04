class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        Arrays.sort(nums);
        int mini = nums[0];
        int maxi = nums[nums.length-1];
        for (int i = mini; i < maxi; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}