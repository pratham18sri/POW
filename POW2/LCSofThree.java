public class LCSofThree {
    public static int lcs(String A, String B, String C) {
        int m = A.length(), n = B.length(), o = C.length();
        int[][][] dp = new int[m + 1][n + 1][o + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= o; k++) {
                    if (A.charAt(i - 1) == B.charAt(j - 1) && B.charAt(j - 1) == C.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], 
                                        Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                    }
                }
            }
        }

        return dp[m][n][o];
    }
}
