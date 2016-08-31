import java.util.Arrays;
import java.util.Comparator;


/**
 * Created by surabhi on 7/29/16.
 */
public class LargestInteger
{
    public static String[] findlarge(int[]x)
    {
        String[] max=new String[x.length];

        for(int i=0;i<x.length;i++)
        {
            max[i]=String.valueOf(x[i]);
        }
        Arrays.sort(max, new Comparator<String>(){
            public int compare(String s1, String s2){
                String leftRight = s1+s2;
                String rightLeft = s2+s1;
                return -leftRight.compareTo(rightLeft);

            }
        });

        //System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int[] numbers={0,0,0};
        int i=0;
        String[]arr=findlarge(numbers);
        StringBuilder sb=new StringBuilder();
        for(String s:arr)
        {
            sb.append(s);
        }
        while(sb.charAt(i)=='0'&&i<sb.length()-1&& sb.length()!=1)
        {
            sb.deleteCharAt(i);
            i++;
        }
        System.out.println(sb.toString().toCharArray());

    }
}
