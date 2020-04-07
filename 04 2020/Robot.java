

public class Robot {
    public int countWays(int x, int y) {
        int[][] dp = new int[x][y];
        dp[0][0] = 1;
        for(int i = 1; i < x; i++){
            dp[i][0] = dp[i-1][0];
        }
        for(int i = 1; i < y; i++){
            dp[0][i] = dp[0][i-1];
        }
        for(int i = 1; i < x; i++){
            for(int j = 1; j < y; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[x-1][y-1];
    }
}