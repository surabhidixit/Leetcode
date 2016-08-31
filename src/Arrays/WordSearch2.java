package Arrays;

import java.util.*;


/**
 * Created by surabhi on 8/24/16.
 */
public class WordSearch2
{
    List<String>list=new ArrayList<>();
    public  List<String> findWords(char[][] board, String[] words) {

        char[][]temp=board;
        boolean[][]visited=new boolean[board.length][board[0].length];
        if(words.length==0||board.length==0||board[0].length==0)
            return list;

            Trie tr=new Trie();
            for(String s:words)
            {
                tr.insert(s);
            }
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[0].length;j++)
                {
                    dfs(board,visited,"",i,j,tr);
                }
            }
         return new ArrayList<>(list);

    }
    public void dfs(char[][]board,boolean[][]visited,String word,int i,int j,Trie tr)
    {

        int m=board.length;
        int n=board[0].length;
        if(i<0||i>=m||j<0||j>=n)
        {
            return;
        }

        if(visited[i][j])
            return;
        word=word+board[i][j];
        if(tr.search(word))
        {
            if(!list.contains(word))
            list.add(word);
        }
        visited[i][j]=true;
        dfs(board,visited,word,i-1,j,tr);
        dfs(board,visited,word,i+1,j,tr);
        dfs(board,visited,word,i,j-1,tr);
        dfs(board,visited,word,i,j+1,tr);
        visited[i][j]=false;
    }

    public static void main(String[] args) {
        char[][]board={{'o','a','a','n'},
        {'e','t','a','e'},
        {'i','h','k','r'},
        {'i','f','l','v'}};
        String[]words={"a"};
        WordSearch2 ws2=new WordSearch2();
        System.out.println(Arrays.toString(ws2.findWords(board,words).toArray()));
    }

}

