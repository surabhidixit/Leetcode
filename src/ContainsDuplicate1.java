import java.util.TreeSet;

/**
 * Created by surabhi on 7/25/16.
 */
public class ContainsDuplicate1 {
    public static boolean isDuplicate(int[]in)
    {
        TreeSet<Integer>tree=new TreeSet<>();
        for(int i:in)
        {
            if(!tree.add(i))
                return true;
        }
        return false;


    }
    public static void main(String[] args) {
        int[]input={1,2,3,4,5};
        System.out.println(isDuplicate(input));
    }
}
