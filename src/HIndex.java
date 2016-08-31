import java.util.Arrays;

/**
 * Created by surabhi on 8/7/16.
 */
public class HIndex {
    public static int hIndex(int[] citations) {
        if (citations.length == 0)
            return 0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++)
        {
            if(citations[i]>=citations.length-i)
                return citations.length-i;
        }
       return 0;
    }

    public static void main(String[] args) {
        int[]nums={1000};
        System.out.println(hIndex(nums));
    }
}
