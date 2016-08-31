import java.util.*;

/**
 * Created by surabhi on 8/12/16.
 */
public class WordLadder
{
    public  int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<WordNode> queue = new LinkedList<WordNode>();
        int max=Integer.MAX_VALUE;
        int k=0;
        int[]a=new int[6];
        queue.add(new WordNode(beginWord, 1));
        wordDict.add(endWord);
        while(!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;
            if(word.equals(endWord)){
                //max=Math.min(max,top.numSteps);
                a[k]=top.numSteps;
                k++;
            }
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                for(char c='a'; c<='z'; c++){
                    char temp = arr[i];
                    if(arr[i]!=c){
                        arr[i]=c;
                    }
                    String newWord = new String(arr);
                    if(wordDict.contains(newWord)){
                        queue.add(new WordNode(newWord, top.numSteps+1));
                        wordDict.remove(newWord);
                    }
                    arr[i]=temp;
                }
            }
        }
       // System.out.println(Arrays.toString(a));
        return 0;
    }

    public static void main(String[] args) {
        String start="hit";
        String end="cog";
        Set<String>dict=new HashSet<>();
        dict.add("hat");
        dict.add("hot");
        dict.add("cot");
        dict.add("dot");
        dict.add("dog");
        dict.add("cog");
        WordLadder wl=new WordLadder();
        System.out.println(wl.ladderLength(start,end,dict));
}}
class WordNode
{
    String word;
    int numSteps;

    public WordNode(String word, int numSteps){
        this.word = word;
        this.numSteps = numSteps;
    }
}
