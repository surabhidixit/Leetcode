import java.util.ArrayList;

/**
 * Created by surabhi on 7/26/16.
 */
public class Concatenate {
    public static void concatenate(String word,String[]words)
    {
        StringBuilder res=new StringBuilder();int i=0;
        ArrayList<Integer>arr=new ArrayList<>();
        for(String w:words)
        {
            res.append(w);
        }

        while(i+res.length()<word.length()) {
            String compare=word.substring(i,i+res.length());
            if(res.toString().equals(compare))
            {
                arr.add(i);
                i=i+res.length();

            }
            else
            {
                i++;
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        String word="foobarthefoobaan";
        String[]words={"foo","bar"};
        concatenate(word,words);
    }
}
