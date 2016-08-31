import java.util.*;

/**
 * Created by surabhi on 7/20/16.
 */
public class MergeIntervals
{
    public static List<Interval> merge(List<Interval> arr)
    {
        if(arr.size()==0)
            return arr;
        return mergeintervals(arr);
    }
    public static ArrayList<Interval> mergeintervals(List<Interval> list)
    {
        ArrayList<Interval> x=new ArrayList<Interval>();
        Collections.sort(list, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                if(i1.start!=i2.start)
                    return i1.start-i2.start;
                else
                    return i1.end-i2.end;
            }
        });
        Interval pre = list.get(0);
        for(int i=0; i<list.size();i++)
        {
            Interval curr = list.get(i);
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
    public static void main(String[] args) {
        List<Interval> inputList=new ArrayList<>();
        inputList.add(new Interval(2,11));
        inputList.add(new Interval(4,10));
        inputList.add(new Interval(2,5));
        inputList.add(new Interval(15,18));
        List<Interval> arr;
       // inputList=new ArrayList<>();
        arr=merge(inputList);
        for(Interval i:arr)
        {
            System.out.println(i.start + " "+i.end);
        }
    }
}
class Interval implements Comparable<Interval> {
    int start;
    int end;
    String name;
    public Interval(int a, int b) {
        start = a;
        end = b;
    }
    public void setStart(int s) {
        this.start = s;
    }
    public void setEnd(int e) {
    }
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }
    @Override
    public int compareTo(Interval interval) {
        return this.start-interval.start;
    }
}