/**
 * Created by surabhi on 7/25/16.
 */
public class RemoveDuplicate2 {
    public static int removeDuplicate(int[]arr)
    {
        int i=1,j=2;
        while(j<arr.length) {
            if (arr[i] == arr[j] && arr[i] == arr[j - 1]) {
                i++;
            } else {
                i++;
                arr[j] = arr[i];
                j++;


            }

        }return i + 1;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,3};
        System.out.println(removeDuplicate(arr));
    }
}
