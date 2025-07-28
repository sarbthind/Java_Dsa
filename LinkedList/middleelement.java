public class middleelement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static Node middlenode(Node head){
        Node fast=head;
        Node slow=head;
     
        while(fast.next!=null){
            fast=fast.next.next;
           
            if(fast==null){
                return slow;
            }
              slow=slow.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        Node ans=middlenode(a);
        System.out.println(ans.data);
    }
}
