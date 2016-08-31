package Arrays;

import java.util.Arrays;

/**
 * Created by surabhi on 8/20/16.
 */
public class Surrounded
{

    public static void numofIslands(char[][]grid)
    {
        int count=0;
        if(grid.length==0||grid==null||grid[0].length==0)
        {
            return;
        }
        int row=grid.length;
        int col=grid[0].length;

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if(grid[i][j]=='X')
                {

                    explore(i,j,grid,row,col);
                }
            }

        }
        System.out.println(Arrays.deepToString(grid));

    }
    public static void explore(int i,int j,char[][]grid,int r,int c)
    {

        if(i<0||j<0||i>=r||j>=c||grid[i][j]!='X')
        {
            return;
        }
            if(grid[i][j]!='0')
            {
                return;
            }
            else {
                grid[i][j]='#';
                explore(i - 1, j, grid, r, c);
                explore(i, j - 1, grid, r, c);
                explore(i + 1, j, grid, r, c);
                explore(i, j + 1, grid, r, c);
            }


    }

    public static void main(String[] args) {
        char[][]nums={{'X','X','X','X'},{'X','0','0','X'},{'X','X','0','X'}};
        numofIslands(nums);


    }}
