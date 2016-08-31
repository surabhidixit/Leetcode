import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by surabhi on 7/28/16.
 */
public class BullsandCows
{
    public static String giveHint(String secret,String guess)
    {

        HashMap<Character,Integer>hs=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int bull=0;
        int cow=0;
        int index=0;
        for(int i=0;i<secret.length();i++)
        {
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            if(c1==c2)
            {
                bull++;
            }
            else
            {
                if(hs.containsKey(c1))
                {
                    int value=hs.get(c1);
                    value++;
                    hs.put(c1,value);
                }
                else {
                    hs.put(c1,1);
                }
            }

        }


            for (int i = 0; i < secret.length(); i++) {
                char c1 = secret.charAt(i);
                char c2 = guess.charAt(i);
                if (c1 != c2) {
                    if (hs.containsKey(c2)) {
                        cow++;
                        if (hs.get(c2) == 1) {
                            hs.remove(c2);
                        } else {
                            int value = hs.get(c2);
                            value--;
                            hs.put(c2, value);
                        }
                    }

                }
            }
            return new String(Integer.toString(bull) + 'A' + Integer.toString(cow) + 'B');
        }

    public static void main(String[] args) {

        System.out.println(giveHint("8578605648","3675352465"));
    }
}
