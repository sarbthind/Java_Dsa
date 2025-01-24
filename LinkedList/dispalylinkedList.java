public class dispalylinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
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
        
        //we have to print the whole linked list only from head
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        Node temp=a;
        // for(int i=0;i<5;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;


        // }
        while(temp!=null){
            System.out.println(temp.data);;
            temp=temp.next;
        }
    }
}