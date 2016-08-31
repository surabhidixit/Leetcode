import java.util.LinkedList;

/**
 * Created by surabhi on 8/11/16.
 */
public class MovingAverage {

    LinkedList<Integer> queue;
    int size;
    double avg;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.queue = new LinkedList<Integer>();
        this.size = size;
    }

    public double next(int val) {
        if(queue.size()<this.size){
            queue.offer(val);
            int sum=0;
            for(int i: queue){
                sum+=i;
            }
            avg = (double)sum/queue.size();

            return avg;
        }else{
            int head = queue.poll();
            double minus = (double)head/this.size;
            queue.offer(val);
            double add = (double)val/this.size;
            avg = avg + add - minus;
            return avg;
        }
    }

    public static void main(String[] args) {
        MovingAverage mv=new MovingAverage(3);
        mv.next(1);
        mv.next(3);
        mv.next(4);
        mv.next(5);
        mv.next(1);
        System.out.println(mv.next(1));

    }
}