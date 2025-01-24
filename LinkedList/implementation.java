public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                // tail=temp;
            }
            else{
                tail.next=temp;
                // tail=temp;
            }
            tail=temp;

        }

        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
                // insertAtEnd(val);
                
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void insertAtanyIndex(int index,int val){
            Node t=new Node(val);
            Node temp=head;
            if(index==0){
                insertAtHead(val);
                return;
            }
            if(index==size()){
                insertAtEnd(val);
                return;
            }
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        void display(){
            Node temp=head;
            System.out.print("Current LL is : ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        
        int size(){
            Node temp=head;
            int size=0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
           // System.out.println("Size of the LL is := "+size);
            return size;
        }
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertAtEnd(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(5);

      int size= l.size();
      System.out.println(size);

        l.insertAtHead(20);
        l.insertAtHead(30);
        l.display();
      size=l.size();
      System.out.println(size);

        l.insertAtanyIndex(3,10);
        l.insertAtanyIndex(5, 12);
        l.display();
      size= l.size();
      System.out.println(size);
    }
}
