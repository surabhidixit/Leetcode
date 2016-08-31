import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by surabhi on 7/21/16.
 */
public class TwoSumIII {
    static HashMap<Integer,Integer> hash=new HashMap<>();
    int i=0;

   // static ArrayList<Integer> x=new ArrayList<>();
    public static boolean givetwosum( int sum)
    {
        for(Integer i:hash.keySet())
        {
            int index=hash.get(i);
            if(hash.containsKey(index))
            {
                if(hash.containsValue(sum-index))
                return true;
            }

        }
        return false;
    }
    public void addValue(int v)
    {

        if(hash.containsKey(v))
        {
            hash.put(v,hash.get(v)+1);
        }
        else
        {
            hash.put(v,1);

        }
    }

    public static void main(String[] args) {
        TwoSumIII ts=new TwoSumIII();
        ts.addValue(2);

        ts.addValue(2);
        System.out.println(givetwosum(4));

    }
}
