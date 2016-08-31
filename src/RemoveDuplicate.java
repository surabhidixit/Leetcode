import java.util.Arrays;

/**
 * Created by surabhi on 7/25/16.
 */
public class RemoveDuplicate {
    public static int[] removeDuplicate(int[]arr)
    {
        int i=0,j=1;
        while(i<arr.length)
        {
            if(arr[i]==arr[j])
            {
                i++;
            }
            else
            {
                j++;
                arr[j]=arr[i];
                i++;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int[]input={12,13,14,15,16,16};
        int[]output=removeDuplicate(input);
        System.out.println(Arrays.toString(output));
    }
}
