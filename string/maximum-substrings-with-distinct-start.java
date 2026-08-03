class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> res = new HashSet<>();
        for(char ch : s.toCharArray()) res.add(ch);
        return res.size();
    }
}