package Arrays;

/**
 * Created by surabhi on 8/24/16.
 */
public class WordSearch
{
    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean flag=false;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(dfs(board,word,i,j,0))
               {
                   return true;
               }
            }
        }

        return flag;

    }
    public static boolean dfs(char[][]board,String word,int i,int j,int k) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n)
            return false;
        if (board[i][j] == word.charAt(k)) {
                char temp = board[i][j];
                board[i][j] = '*';
                if (k == word.length() - 1)
                    return true;
                else if (dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i, j + 1, k + 1) ||
                        dfs(board, word, i, j - 1, k + 1)) {
                    return true;
                }
                board[i][j] = temp;
            }
            return false;
    }
    public static void main(String[] args) {
        char[][]board={{'A','B','C','E'},{'F','T','P','Q'}};
        System.out.println(exist(board,"BAFT"));
    }
}
