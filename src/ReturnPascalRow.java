import java.util.ArrayList;
import java.util.List;

/**
 * Created by surabhi on 8/1/16.
 */
public class ReturnPascalRow
{
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>>arr=createList(rowIndex+1);
       // System.out.println(arr.size());
        if(rowIndex>=arr.size())
        {
            return null;
        }
        else
        {
            return arr.get(rowIndex);
        }

    }
    public static List<List<Integer>> createList(int numRows)
    {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <=0){
            return triangle;
        }
        for (int i=0; i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }


    public static void main(String[] args) {
        System.out.println(getRow(22));
    }
}
