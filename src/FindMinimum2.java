/**
 * Created by surabhi on 7/27/16.
 */
public class FindMinimum2 {
    public static void main(String[] args) {
        int[]a={4,5,6,1,2,3};
        int left=0,right=a.length-1;

        int x=1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(a[left]==a[right])
            {
                left++;
            }
            if(right-left==1)
            {
                if(a[right]==x)
                {
                    System.out.println(right);
                    break;
                }

                else if(a[left]==x)
                {
                    System.out.println(left);break;
                }
                else
                {
                    System.out.println(-1);break;
                }
            }
            if(a[mid]==x)
            {
                System.out.println(mid);break;
            }

            if(a[left]<=a[right])
            {
                if(x<a[mid]&&x>a[left])
                {
                    right=mid-1;
                }
                else
                    left=mid+1;
                if(a[right]==x)
                {
                    System.out.println(right);
                    break;
                }

                else if(a[left]==x)
                {
                    System.out.println(left);break;
                }
                else
                {
                    System.out.println(-1);break;
                }
            }
            else
            {
                if(x>a[mid]&&a[left]>a[right]&&x>a[right])
                    right=mid-1;
                else
                    left=mid+1;
            }
        }

    }
}
