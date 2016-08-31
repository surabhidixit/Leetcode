import java.util.*;

/**
 * Created by surabhi on 8/12/16.
 */
public class WordLadder2
{
    List<WNode> inner = null;
    List<List<WNode>>outer=new LinkedList<>();

    public List<List<WNode>> createList(String start, String end, Set<String> wordDict)
    {
       /* if(start==end)
            return top.numSteps;*/
        inner=new LinkedList<>();
        inner.add(new WNode(start,1));
        wordDict.add(end);
        int j=0;
        while(!inner.isEmpty())
        {
            WNode top=inner.remove(j);

            if(top.word.equals(end))
            {
                inner.add(top);
                outer.add(inner);
            }
            char[] word=top.word.toCharArray();
            String q=null;
        for(int i=0;i<word.length;i++)
        {

            for(char c='a';c<='z';c++)
            {
                char temp=word[i];
                if(word[i]!=c)
                {
                    word[i]=c;
                    q=new String(word);

                }
                if(wordDict.contains(q))
                {
                    inner.get(j).prev=top;
                    inner.add(new WNode(new String(word),inner.get(j).prev.numSteps+1));
                    j++;
                    wordDict.remove(word);
                }
                word[i]=temp;

            }
        }
            if(!outer.contains(inner))
                outer.add(inner);
            inner=new LinkedList<>();
        }
        return outer;
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
        WordLadder2 wl=new WordLadder2();
       List<List<WNode>> list=wl.createList(start,end,dict);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
class WNode
{
    String word;
    int numSteps;
    WNode prev;
    public WNode(String word,int numSteps)
    {
        this.word=word;
        this.numSteps=numSteps;
        prev=null;
    }
}
