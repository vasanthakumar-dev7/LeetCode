class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = new String();
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=i; j--){
                if(isPali(s.substring(i, j+1))){
                    if(j-i+1 > max){
                        max = j-i+1;
                        res = s.substring(i, j+1);
                    }
                }
            }
        }
        return res;
    }
    public static boolean isPali(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}