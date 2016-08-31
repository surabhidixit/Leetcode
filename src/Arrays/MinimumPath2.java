package Arrays;

import java.math.BigInteger;

/**
 * Created by surabhi on 8/17/16.
 */
public class MinimumPath2 {
    public static int uniquePaths(int m, int n) {
        return choose(m + n - 2, n - 1);
    }

    // Calculate "n choose k"
    public static int choose(int n, int k) {
        if (k > n - k) k = n - k;
        double result = 1;
        for (int i = 1; i <= k; ++i) {
            result *= n - i + 1;
            result /= i;
        }
        return (int) result;
    }
    //we can use DP to solve this problem by simply this equation
    //dp[0][0]=1;
    //dp[i][j]=dp[i-1][j]+dp[i][j-1];

    public static void main(String[] args) {
        //int[][]nums={{1,2},{1,1}};
        System.out.println(uniquePaths(1,2));
    }
}
