public class reverselinkedlist {
    static class  Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }

    }
   static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node tem=new Node(val);
        
            if(head==null){
                head=tem;
            } 
            else{
                tail.next=tem;
            }
            tail=tem;
        }
        void reverse(){
            Node curr=head,prev=null,next;
            
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                
                prev=curr;
                curr=next;
            }
            head=prev;
            
        }
        void display(){
            Node temp=head;
            while (temp!=null) 
            {
            System.out.print(temp.val+" ");
                temp=temp.next;    
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertAtEnd(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        System.out.println("Linkedlist before reverse: ");
        l.display();
        System.out.println("Linkedlist after reverse: ");
        l.reverse();
        l.display();



    }
}