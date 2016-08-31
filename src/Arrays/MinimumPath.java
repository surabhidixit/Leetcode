package Arrays;

/**
 * Created by surabhi on 8/17/16.
 */
public class MinimumPath {
    public static int minPathSum(int[][] grid) {
        int sum=0,i=0,j=0;
        int[][]tc=new int[grid.length][grid[0].length];
        int m=grid.length-1;
        int n=grid[0].length-1;
        tc[0][0]=grid[0][0];
        for (i = 1; i <= m; i++)
        {
            tc[i][0] = tc[i-1][0] + grid[i][0];
        }

     /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
        {
            tc[0][j] = tc[0][j-1] + grid[0][j];
        }
        for (i = 1; i <= m; i++)
        {
            for (j = 1; j <= n; j++)
            {
                //if diagonals are allowed use this with the min method else use second line
                tc[i][j] = min(tc[i-1][j-1], tc[i-1][j], tc[i][j-1]) + grid[i][j];
                //when diagonal is not allowed
                tc[i][j] = Math.min(tc[i-1][j], tc[i][j-1]) + grid[i][j];
            }
        }

        return tc[m][n];

    }
    static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }

    public static void main(String[] args) {
        int[][]nums={{1,2},{1,1}};
        System.out.println(minPathSum(nums));
    }
}
