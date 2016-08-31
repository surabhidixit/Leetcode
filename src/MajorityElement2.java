import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by surabhi on 7/28/16.
 */
public class MajorityElement2 {
    public static List<Integer> majority(int[]a)
    {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int j=1;List<Integer> list=new ArrayList<>();
        if(a==null)
            return null;
        for(int i:a)
        {
            if(hs.containsKey(i))
            {
                hs.put(i,hs.get(i)+1);
            }
            else
            {
                hs.put(i,j);
            }
        }


        for(int key: hs.keySet()) {
            System.out.println(a.length%3);
            if(hs.get(key)>(a.length%3)) {
                list.add(key);
            }
            else if(!(hs.get(key)>(a.length%3)))
                list.add(key);
        }
        return list;


    }

    public static void main(String[] args) {
        int[]a={1,2,3};
        System.out.println(majority(a));
    }
}
