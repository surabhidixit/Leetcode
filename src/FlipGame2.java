/**
 * Created by surabhi on 8/5/16.
 */
public class FlipGame2 {
    //my method using count of +s, if it is >3 then perhaps 1st player could win
/*    public static boolean isWinner(String s)
    {
        char[]c=s.toCharArray();
        int i=0;
        int start=0,end=c.length-1;
        int mid=(start+end)/2;
        int lcount=0,rcount=0;
        int count=0;

        if(s.length()<2)
        {
            return false;
        }
        else
        {
            count=findCount(c,start,end);

                if(c.length>3)
                {
                    c[mid]='-';
                    c[mid+1]='-';
                    count--;
                    if(count >3)
                        return true;
                    else
                    {if(c[mid]=='-')
                    {
                        lcount=findCount(c,start,mid-1);
                        rcount=findCount(c,mid+1,end);
                    }
                    if(lcount>3||rcount>3)
                        return true;}

                }
                else
                {   if(c[mid]=='-')
                    {
                        lcount=findCount(c,start,mid-1);
                        rcount=findCount(c,mid+1,end);
                    }
                if(lcount>3||rcount>3)
                    return true;
                }


        }
        return false;
    }
    public static int findCount(char[]c,int i,int k)
    {
        int count=0;
        int len=k-i+1;
        for(int j=0;j<len-1;j++)
        {
            if(c[j]==c[j+1]&&c[j]=='+')
            {
                count++;
            }
        }
        return count;
    }*/
    public static boolean canWin(String s) {
        if(s==null||s.length()==0){
            return false;
        }

        return canWinHelper(s.toCharArray());
    }

    public static boolean canWinHelper(char[] arr){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]=='+'&&arr[i+1]=='+'){
                arr[i]='-';
                arr[i+1]='-';

                boolean win = canWinHelper(arr);

                arr[i]='+';
                arr[i+1]='+';

                //if there is a flip which makes the other player lose, the first play wins
                if(!win){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(canWin("++-++++"));
    }
}
