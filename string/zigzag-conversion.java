class Solution {
    public String convert(String s, int numRows) {

        char[][] arr = new char[numRows][s.length()];

        int x=0;
        int y=0;
        int count = 0;
        int dir = 1;
        while(count<s.length()){
            arr[x][y] = s.charAt(count);
            count++;


            if (x == numRows - 1) {
                dir = -1;
            } 

            else if (x == 0) {
                dir = 1;
            }

            if (dir == 1) {
                x++; 
            } else {
                x--;
                y++; 
            }
        }
        System.out.println(Arrays.deepToString(arr));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numRows; i++){
            for(int j=0; j<s.length(); j++){
                if(arr[i][j] != 0){
                    sb.append(arr[i][j]);
                }
                if(sb.length() == s.length()){
                    return sb.toString();
                }
            }
        }
        return "";
    }
}