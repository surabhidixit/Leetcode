import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by surabhi on 8/14/16.
 */
public class Merge
{
    public static List<Interval> merge(List<Interval> arr,Interval t)
    {
        if(arr.size()==0&&t==null)
            return arr;
    {
        arr.add(t);
        ArrayList<Interval> x=new ArrayList<Interval>();
        Collections.sort(arr, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                if(i1.start!=i2.start)
                    return i1.start-i2.start;
                else
                    return i1.end-i2.end;
            }
        });
        Interval pre = arr.get(0);
        for(int i=0; i<arr.size();i++)
        {
            Interval curr = arr.get(i);
            if(curr.start>pre.end){
                x.add(pre);
                pre = curr;
            }else{
                Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre= merged;
            }
        }
        x.add(pre);
        return x;
    }
}
    public static void main(String[] args) {
        List<Interval> inputList=new ArrayList<>();
        inputList.add(new Interval(1,11));
        inputList.add(new Interval(4,10));
        inputList.add(new Interval(2,5));
        inputList.add(new Interval(15,18));
        List<Interval> arr;
         //inputList=new ArrayList<>();
        arr=merge(inputList,new Interval(2,90));
        for(Interval i:arr)
        {
            System.out.println(i.start + " "+i.end);
        }
    }
}
