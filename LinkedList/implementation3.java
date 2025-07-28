import java.util.*;
public class implementation3 {
   public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        void insertatend(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertathead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=head;
                head=temp;

            }
        }
        void insertAtanyIndex(int index,int val){
            Node t=new Node(val);
            Node temp=head;
            if(index==0){
                insertathead(val);
                return;
            }
            if(index==size()){
                insertatend(val);
                return;
            }
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int  size(){
            Node temp=head;
            int size=0;
            while(temp.next!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }

    }
    public static void main(String[] args){
        LinkedList l=new LinkedList();
    }
}
