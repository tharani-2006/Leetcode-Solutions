class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
        int[][] dp = new int[n][n];

        int longest = 1;
        int start = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                if (i == 1 && s.charAt(j) == s.charAt(j + 1)) {
                    dp[j][j + 1] = 2;
                    longest = 2;
                    start = j;
                    count = 2;
                } else if (s.charAt(j) == s.charAt(j + i) && dp[j + 1][j + i - 1] != 0) {
                    dp[j][j + i] = dp[j + 1][j + i - 1] + 2;
                    if (dp[j][j + i] > longest) {
                        longest = dp[j][j + i];
                        start = j;
                        count = i + 1;
                    }
                }
            }
        }

        return s.substring(start, start + count);
    }
}