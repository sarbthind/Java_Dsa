public class nthnodefromlast {
    // in one traversal
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node findnthnodefromlast(Node head,int index){
        Node fast=head;
        Node slow=head;
        if(head==null) return null;
        if(head.next==null) return null;
        for(int i=1;i<=index;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null){
            fast=fast.next;
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
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node ans=findnthnodefromlast(a,2);
        System.out.println(ans.data);
    }
}
