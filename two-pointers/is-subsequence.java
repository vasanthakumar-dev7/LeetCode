class Solution {
    public boolean isSubsequence(String s, String t) {
        List<Character> lis = new ArrayList<>();
        for(int i=0; i<t.length(); i++){
            lis.add(t.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            if(!lis.contains(s.charAt(i))){
                return false;
            }
            lis.remove((Character)s.charAt(i));
        }
        return true;
    } 
}