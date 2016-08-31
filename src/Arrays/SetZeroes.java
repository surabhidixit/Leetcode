package Arrays;

import java.util.Arrays;

/**
 * Created by surabhi on 8/15/16.
 */
public class SetZeroes {
    //careercup method, use two 1D arrays each for row and column to store the zeroes.
    public static void setZeros(int[][] matrix) {

        int[] row = new int[matrix.length];

        int[] column = new int[matrix[0].length];

// Store the row and column index with value 0

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length;j++) {

                if (matrix[i][j] == 0) {

                    row[i] = 1;

                    column[j] = 1;


                }

            }

        }

// Set arr[i][j] to 0 if either row i or column j has a 0

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if ((row[i] == 1 || column[j] == 1)) {

                    matrix[i][j] = 0;

                }

            }

        }
    }
    //my method where I used 2D boolean array to store the zeroes
    //is too inefficient
    public static void setZeroes(int[][] matrix) {
        boolean[][]zeroes=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    zeroes[i][j]=false;
                }
                else
                    zeroes[i][j]=true;
            }
        }

        for(int i=0;i<zeroes.length;i++)
        {
            for(int j=0;j<zeroes[0].length;j++)
            {
                if(zeroes[i][j]==false)
                {
                    int t1=0,t2=0;
                    while(t1<zeroes.length)
                    {
                        matrix[t1][j]=0;
                        t1++;
                    }
                    while(t2<zeroes[0].length)
                    {
                        matrix[i][t2]=0;
                        t2++;
                    }
                }

            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        int[][]matrix={{1,2,0},{0,1,6},{5,0,7}};
        setZeroes(matrix);
    }
}
