/**
 * Created by surabhi on 8/20/16.
 */
public class LongestFilePath
{
    public static int printSum(String s){
        String[] arr=s.split("\n");
        int sum=0, spaces=0;
        for(int i=arr.length-1;i>=0;i--){
            String line=arr[i];
            if(line.contains(".gif") | line.contains(".jpeg") ){
                spaces=line.length()-line.trim().length();
            }
            if(spaces> line.length()-line.trim().length() ){
                sum+=line.trim().length()+1;
                spaces--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
