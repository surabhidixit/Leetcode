import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by surabhi on 8/11/16.
 */
public class SlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length==0)
            return nums;
        int i=0,j=i+k-1;
        ArrayList<Integer>arr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        while(j<nums.length&&i<=j)
        {
            int temp1=i;
            int temp2=j;
            while(i<=j)
            {
                if(nums[i]>nums[j])
                {
                    max=Math.max(max,nums[i]);
                    i++;
                    j--;

                }
                else if(nums[j]>nums[i])
                {
                    max=Math.max(max,nums[j]);
                    j--;
                    i++;

                }
                else
                {
                    max=Math.max(max,nums[i]);
                    i++;
                    j--;

                }
            }
            arr.add(max);
            temp1++;
            temp2++;
            i=temp1;
            j=temp2;
            max=Integer.MIN_VALUE;
        }
        int[]x=new int[arr.size()];
        int l=0;
        for(int t:arr)
        {
            x[l++]=t;
        }
        return x;


    }
    //second method faster
    /*public static int[] SlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return new int[0];

        int[] result = new int[nums.length-k+1];

        LinkedList<Integer> deque = new LinkedList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!deque.isEmpty()&&deque.peekFirst()==i-k)
                deque.poll();

            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }

            deque.offer(i);

            if(i+1>=k)
                result[i+1-k]=nums[deque.peek()];
        }

        return result;
    }*/

    public static void main(String[] args) {
        int[]x={1};
        SlidingWindow win=new SlidingWindow();
        System.out.println(Arrays.toString(win.maxSlideWindow(x,1)));
    }
    //another method to test heap
    public int[] maxSlideWindow(int[] nums, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        if(nums.length==0)
            return nums;
        int i=0,j=i+k-1;
        int[]res=new int[nums.length-k+1];
        BinaryHeap bn=null;
        while(j<nums.length&&i<=j)
        {
            bn=new BinaryHeap(nums,i,j);
            arr.add(bn.getMax());
            i++;
            j++;

        }
        int[]x=new int[arr.size()];
        int l=0;
        for(int t:arr)
        {
            x[l++]=t;
        }
        return x;

}
//trying to use maxHeap
    //works well for small test cases not useful for bigger tests
public class BinaryHeap {
    //ArrayList to hold the heap
    List h = new ArrayList();
    public BinaryHeap(){

    }
    //Constructs the heap - heapify
    public BinaryHeap(int[] e,int start,int end) {
        for(int i=start; i<=end;i++)
        {
            add(e[i]);
        }
    }
    private int intGet(int key){
        return new Integer(h.get(key).toString()).intValue();
    }
    public void add(int key){
        h.add(null);
        int k = h.size()-1;
        while (k>0){
            int parent = (k-1)/2;
            int parentValue = new Integer(h.get(parent).toString()).intValue();
            //MaxHeap -
            //for minheap - if(key > parentValue)
            if(key <= parentValue){
                break;
            }
            h.set(k,parentValue);
            k=parent;
        }
        h.set(k,key);
    }
    public int getMax()
    {
        return new Integer(h.get(0).toString()).intValue();
    }
    /*public int remove()
    {
        int removeNode = new Integer(h.get(0).toString()).intValue();
        int lastNode = new Integer(h.remove(h.size()-1).toString()).intValue();
        percolateUp(0,lastNode);
        return removeNode;
    }*/
    public boolean isEmpty()
    {
        return h.isEmpty();
    }}}

