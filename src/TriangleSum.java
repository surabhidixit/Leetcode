/**
 * Created by surabhi on 7/25/16.
 */
public class TriangleSum {

    public static int addinput(int[][]x)
    {
        int i=0,j=0,sum=0,previous=0;
        while(i<x.length)
        {
            if(i-previous==0||i-previous==1&&j==0||j==1)
                {
                    previous=i;
                    sum+=x[i][j];
                    i++;

                }

            if(i>1&&j!=1)
                j=1;

        }
        return sum;
    }
    public static void main(String[] args) {
        int[][]input={{-1},{2,3},{1,-1,3},{23,12,3,12}};
        System.out.println(addinput(input));
    }
}
