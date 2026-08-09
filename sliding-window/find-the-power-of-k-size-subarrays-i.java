class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (nums.length == 1 || k == 1) {
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            if (checker(nums, i, k)) {
                int max = Integer.MIN_VALUE;

                for (int j = i; j < i + k; j++) {
                    max = Math.max(nums[j], max);
                }
                res[i] = max;
            } else {
                res[i] = -1;
            }
        }
        return res;
    }

    public boolean checker(int[] nums, int i, int k) {
        for (int j = i; j < i + k - 1; j++) {
            if (nums[j] < nums[j + 1] && nums[j + 1] == nums[j] + 1) {
            } else {
                return false;
            }
        }
        return true;
    }
}