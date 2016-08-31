import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by surabhi on 7/30/16.
 */
public class CompareVersions
{
    public static int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");

        int length = Math.max(levels1.length, levels2.length);
        for (int i=0; i<length; i++) {
            Integer v1 = i < levels1.length ? Integer.valueOf(levels1[i]) : 0;
            Integer v2 = i < levels2.length ? Integer.valueOf(levels2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(compareVersion("1.5","1"));
    }
}
