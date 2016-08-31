package Arrays;

/**
 * Created by surabhi on 8/20/16.
 */
public class MaximalSquare
{
    public static int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        if (n==0)
            return 0;
        int m = matrix[0].length;
        if (m==0)
            return 0;
        int maxSideLen = 0;
        for (int i=0; i<n-maxSideLen; i++) {
            for (int j=0; j<m-maxSideLen; j++) {
                int maxOneLen = Math.min(m-j, n-i);
                for (int t=i; t<Math.min(n, i+maxOneLen); t++) {
                    for (int s=j; s<j+maxOneLen; s++) {
                        if (matrix[t][s] == '0') {
                            maxOneLen = s - j;
                            break;
                        }
                    }
                    if (maxOneLen < maxSideLen)
                        break;
                }
                maxSideLen = Math.max(maxOneLen, maxSideLen);
            }
        }
        return maxSideLen * maxSideLen;
    }

    public static void main(String[] args) {
        char[][]mat={{'1','0','0'},{'0','0','0'}};
        System.out.println(maximalSquare(mat));
    }
}
