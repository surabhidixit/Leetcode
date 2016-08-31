import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by surabhi on 7/19/16.
 */
public class Transform
{
    public static int transform(String start, String end, Set s) {
        LinkedList<Word> q = new LinkedList<Word>();
        q.add(new Word(start, 1));
        s.add(end);
        while (!q.isEmpty()) {
            Word t = q.remove();
            String word = t.name;
            if (t.equals(end)) {

                return t.count;
            }
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    if (arr[i] != c) {
                        arr[i] = c;
                    }
                    String find = new String(arr);
                    if (s.contains(find)) {
                        q.add(new Word(find, t.count + 1));
                        s.remove(find);
                    }
                    arr[i] = temp;
                }
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        HashSet<String>s=new HashSet<>();
        s.add("hot");
        s.add("dot");
        s.add("dog");
        s.add("lot");
        s.add("log");
        int n=transform("hit","cog",s);
        System.out.println(n);
    }
}
class Word
{
    String name;
    int count;
    public Word(String s,int n)
    {
        name=s;
        count=n;
    }
}
