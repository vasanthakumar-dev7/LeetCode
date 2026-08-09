class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int presum = 0;
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            if (presum == k)
                c++;
            int rem = presum - k;
            if (freq.containsKey(rem)) {
                c +=freq.get(rem);
            }
            freq.put(presum, freq.getOrDefault(presum, 0) + 1);
        }
        return c;
    }
}