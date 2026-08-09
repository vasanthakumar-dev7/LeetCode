class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'V') {
                res += 5;
            } else if (s.charAt(i) == 'L') {
                res += 50;
            } else if (s.charAt(i) == 'D') {
                res += 500;
            } else if (s.charAt(i) == 'M') {
                res += 1000;
            } else if (s.charAt(i) == 'I') {

                if (i < n - 1) {
                    if (s.charAt(i + 1) == 'V') {
                        res += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        res += 9;
                        i++;
                    } else {
                        res += 1;
                    }
                } else {
                    res += 1;
                }

            } else if (s.charAt(i) == 'X') {

                if (i < n - 1) {
                    if (s.charAt(i + 1) == 'L') {
                        res += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        res += 90;
                        i++;
                    } else {
                        res += 10;
                    }
                } else {
                    res += 10;
                }

            } else if (s.charAt(i) == 'C') {
                if (i < n - 1) {
                    if (s.charAt(i + 1) == 'D') {
                        res += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        res += 900;
                        i++;
                    } else {
                        res += 100;
                    }
                } else {
                    res += 100;
                }

            }
        }
        return res;
    }
}