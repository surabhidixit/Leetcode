package Arrays;

/**
 * Created by surabhi on 8/15/16.
 */
public class Search2D {
/*
    public static boolean searchMatrix(int[][] matrix, int target) {
        int j=0,i=0;
        int temp;
        boolean flag=false;
        if(target<matrix[0][0]||matrix.length==0||target>matrix[matrix.length-1][matrix[0].length-1])
            return false;
        else
        {
            while(i<matrix.length-1)
            {
                if(target>=matrix[i][0]&&target<matrix[i+1][0])
                {
                    return find(matrix,i,matrix[0].length-1,target);

                }
                else
                    i++;
            }
            if(i==matrix.length-1)
            {
                flag=find(matrix,i,matrix[0].length-1,target);
            }
            return flag;
        }
    }
    public static boolean find(int[][]matrix,int s,int e,int target)
    {
        int x=0;
        int mid=x+Math.abs(e-x)/2;
        if(target==matrix[s][e])
            return true;
       else
        {
            while (s<matrix.length&&e<matrix[0].length) {
                mid=x+Math.abs(e-x)/2;
                int test=matrix[s][mid];
                if(target==matrix[s][e]||target==test)
                {
                    return true;
                }
                if(target<test)
                {
                    e=mid-1;
                }
                else if(target>test)
                {
                    if(target<matrix[s][0]||target>matrix[s][e])
                    {
                        return false;
                    }
                    else
                    {
                       e--;
                    }
                }
            }
        }
        return false;
    }
*/
    //second method works for both sorted row and columns as input
public static boolean searchMatrix(int[][] matrix, int target) {
    int m=matrix.length-1;
    int n=matrix[0].length-1;

    int i=m;
    int j=0;

    while(i>=0 && j<=n){
        if(target < matrix[i][j]){
            i--;
        }else if(target > matrix[i][j]){
            j++;
        }else{
            return true;
        }
    }

    return false;
}
    public static void main(String[] args) {
        int[][]nums={{1,3,5}};
        System.out.println(searchMatrix(nums,1));
    }
}
