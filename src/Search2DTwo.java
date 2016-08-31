/**
 * Created by surabhi on 8/15/16.
 */
public class Search2DTwo
{
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
