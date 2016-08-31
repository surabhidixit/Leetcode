import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by surabhi on 7/31/16.
 */
public class GasStation {
    public static int findCost(int[]gas,int[]cost) {
        int gsum=0,csum=0;
        int start=0;
        int diff=0;
        for(int i=0;i<gas.length;i++)
        {
           int k=i==cost.length?0:cost[i];
            gsum+=gas[i];
            csum+=cost[i];
            diff=diff+gas[i]-k;
            if(diff<0)
            {
                start=i+1;
                diff=0;
            }
        }
        if(gsum<csum)
        {
            return -1;
        }
        else
        {
            return start;
        }
    }
    public static void main(String[] args) {
        int[]gas={1,2,3,4,5};
        int[]cost={3,4,5,1,2};

        System.out.println(findCost(gas,cost));
    }
}
//initial method turns out wrong to use hashmap since we just need to find the difference in the entered set of values.
    /*   if(gas.length==cost.length)
        {
            if(gas[0]>=cost[0]&&gas.length!=1)
                return cost[0];
            if(gas.length==1&&gas[0]>=cost[0])
                return 0;
            if(gas[0]<=cost[0]&&gas.length==2)
                return cost[1];
            else
                return -1;

        }
        if(cost.length>gas.length)
        {
            return cost[gas.length-1];
        }
        HashMap<GasNode,Integer>res=null;
        res=setValue(gas,cost);

        Iterator it =res.entrySet().iterator();
        int sum=0;
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Object start=pair.getKey();
            GasNode x=(GasNode)start;
            int c=(Integer)pair.getValue();
            //System.out.println(x.val+"->"+x.next.val);
            if(c!=x.val)
            {
                break;
            }
            else {
                sum=sum+(Integer)pair.getValue();
            }



        }
        return sum;
    }
    public static HashMap<GasNode, Integer> setValue(int[] x,int[] z)
    {
        HashMap<GasNode,Integer>hs=new HashMap<>();
        int j=0;int i=0;
        while(j<x.length-1&&i<z.length&&x.length>=z.length)
        {
                hs.put(new GasNode(x[j],x[j+1]),z[i]);
                i++;
                j++;

        }

        return hs;
    }
class GasNode
{
    int val;
    GasNode next;
    public GasNode(int vl)
    {
        val=vl;
        next=null;
    }
    public GasNode(int x,int y)
    {
        val=x;
        this.next=new GasNode(y);
    }
}
*/