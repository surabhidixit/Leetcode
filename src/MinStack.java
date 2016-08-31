/**
 * Created by surabhi on 7/28/16.
 */
public class MinStack {
    Node head;
    public static void main(String[] args) {
        MinStack obj=new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-1);
        obj.push(-3);
        System.out.println(obj.getMin());
        System.out.println(obj.pop());

        System.out.println(obj.getMin());
    }
    public void push(int x)
    {
        Node n=new Node(x);
        if(head==null)
        {
            head=n;
            head.next=null;
            head.min=head.element;
        }
        else
        {
            n.min=Math.min(head.min,n.element);
            n.next=head;
            head=n;
        }

    }
    public int getMin()
    {
        return head.min;
    }
    public int pop()
    {
        if(head!=null)
        {
            Node temp=head;
            head=head.next;
            head.min=Math.min(head.next.min,head.min);
            return temp.element;

        }
        else
            return Integer.MIN_VALUE;
    }
    public Node top()
    {
        if(head==null)
        {
            return null;
        }
        else
            return head;
    }
}

class  Node
{
    int min;
    int top;
    int element;
    Node next;
    public Node(int element)
    {
        this.element=element;
    }
}