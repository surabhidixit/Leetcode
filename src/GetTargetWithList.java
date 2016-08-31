import java.util.ArrayList;

/**
 * Created by surabhi on 8/5/16.
 */
//will get back
public class GetTargetWithList
{
    public static boolean getArithmetic(ArrayList<Integer> x,int target)
    {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int left,right;
        for(int i:x)
        if(target==i)
            return true;
        else
        {
            for(int z:x) {
                max = Math.max(max, z);
                min = Math.min(min, z);
            }
        }



    return false;
}

    public static void main(String[] args) {
        ArrayList<Integer>input=new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        getArithmetic(input,21);

    }
}
