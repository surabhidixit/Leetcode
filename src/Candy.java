import java.util.Arrays;

/**
 * Created by surabhi on 8/1/16.
 */
public class Candy {
    public static int candy(int[] ratings) {

        int len = ratings.length;
        int[] candy = new int[len];

        candy[0] =1;
        for (int i = 1; i < len; ++i) {
            if (ratings[i] > ratings[i-1]) {
                candy[i] = candy[i-1] + 1;
            } else {
                candy[i] = 1;
            }
        }

        int total = candy[len-1];
        for (int i = len - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i+1] && candy[i] <= candy[i+1]) {
                candy[i] = candy[i+1] + 1;
            }
            total += candy[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[]rate={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(candy(rate));
    }
}
