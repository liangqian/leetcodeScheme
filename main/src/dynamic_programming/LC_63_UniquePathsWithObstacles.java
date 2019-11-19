package dynamic_programming;

/**
 * @author alis
 * @date 2019/11/17 2:16 AM
 * @description
 */
public class LC_63_UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int rows = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[rows][column];
        dp[0][0] = 1;
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] != 1) {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < column; j++) {
            if (obstacleGrid[0][j] != 1) {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rows - 1][column - 1];
    }

    /**
     * dp
     * 子问题：从(0,0)到达(i,j)的步数宗和
     * 状态定义
     * DP方程 dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
     *
     * @param
     * @return
     * @date 2019/11/19 10:03 AM
     */
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        int rows = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[rows][column];
        dp[0][0] = 1;
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < column; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = 0;
            } else {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rows - 1][column - 1];
    }
}