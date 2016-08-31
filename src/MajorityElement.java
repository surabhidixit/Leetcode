import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by surabhi on 7/28/16.
 */
public class MajorityElement {

        public static int majorityElement(int[] num) {
        if (num.length == 1) {
            return num[0];
        }

        Arrays.sort(num);
        return num[(num.length / 2)];
    }


    public static void main(String[] args) {
        int[]a={1};
        System.out.println(majorityElement((a)));
    }
}
