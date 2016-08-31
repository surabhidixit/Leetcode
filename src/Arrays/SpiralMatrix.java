package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by surabhi on 8/15/16.
 */
public class SpiralMatrix
{
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int i=0,j=0;int[]res=new int[2];
        if(res[0]<matrix.length&&res[1]<matrix[0].length)
            res=print(matrix,res[0],res[1],list);
        if(res[1]==matrix[0].length-1&&res[0]==0)
        {
            res=print(matrix,++res[0],res[1],list);
        }
        if(res[0]==matrix.length)
            res=print(matrix,--res[0],res[1],list);
        return list;

    }
    public static int[] print(int[][]matrix,int i,int j,List<Integer>list)
    {
        int[]res=new int[2];
        if(j<matrix[0].length)
        {
            while(j<matrix[0].length)
            {
                if(j==matrix[0].length-1)
                {
                    while (i<matrix.length)
                    {
                        list.add(matrix[i++][j]);
                    }
                    break;
                }
                else
                {
                    list.add(matrix[i][j++]);
                }
            }
            res[0]=i;
            res[1]=j;
        }
        else if(j==matrix[0].length-1)
        {
            while(j>0)
            {
                list.add(matrix[i][--j]);
            }
            res[0]=i;
            res[1]=j;
        }
        else if (j==0&&i>0)
        {

            while(i>0)
            {

                list.add(matrix[--i][j]);

            }
            res[0]=i;
            res[1]=j;


        }
        return res;

    }

    public static void main(String[] args) {
        int[][]spiral={{12,2,7},{7,5,3},{0,9,34}};
        System.out.println(Arrays.toString(spiralOrder(spiral).toArray()));
    }
}
