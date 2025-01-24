public class lengthfunction {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head,int c){
        // int count=0;
        // while(head!=null){
        //     count++;
        //     head=head.next;
        // }
        // return count;

        // if(head==null) return c;

        // return length(head.next,c+1);

        if(head==null) return 0;

        return 1+length(head.next,c);
    

    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        int count=0;
        int length=length(a,count);
        System.out.println(length);
    }
}
