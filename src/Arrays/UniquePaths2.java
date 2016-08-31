package Arrays;

/**
 * Created by surabhi on 8/17/16.
 */
public class UniquePaths2
{
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m=obstacleGrid.length;int flag=0;
            int sum1=0,sumf=0,sum2=0;
            int n=obstacleGrid[0].length;

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(obstacleGrid[i][j]==1) {

                        sum2+=choose(m-i-1,n-j-1)*choose(i+j,j);
                    }

                    else
                    {
                        sum1+=choose(i+j,i);
                    }
                }
        }

        return sum2>0?sum2:sum1;
    }
    public static int choose(int n, int k) {
        if(n<=0&&k<=0)
            return 0;
        if (k > n - k) k = n - k;
        double result = 1;
        for (int i = 1; i <= k; ++i) {
            result *= n - i + 1;
            result /= i;
        }
        return (int) result;
    }
    public static void main(String[] args) {
        int[][]nums={{0}};
        System.out.println(uniquePathsWithObstacles(nums));

    }
}
