class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int num : nums){
            res.add(num);
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        } 
        for (int i = mini; i <= maxi; i++) {
            if (res.contains(i)) {
                res.remove(Integer.valueOf(i));
            }else{
                res.add(i);
            }
        }
        return res;
    }
}