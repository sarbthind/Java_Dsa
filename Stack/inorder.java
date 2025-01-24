import java.util.*;
import java.util.LinkedList;

public class inorder {
    public static  class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;  
        }
    }
    public static Node buildtree(int[] arr){
        Node root=null;
        int i=1;
        Queue<Node> q=new LinkedList<>();
        root=new Node(arr[0]);
        q.add(root);
        while(!q.isEmpty()&&i<arr.length){
            Node curr=q.poll();
            if(i<arr.length){
                curr.left=new Node(arr[i]);
                i++;
                q.add(curr.left);
            }
            if(i<arr.length){
                curr.right=new Node(arr[i]);
                q.add(curr.right);
                i++;
            }
        }
        return root;
    }
    public static void iterativeinorder(Node root){
        if(root==null) return;
        List<Integer> ans=new LinkedList<>();
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while(curr!=null||!s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            ans.add(curr.data);
            curr=curr.right;
        }
        for(int i:ans) System.out.print(i+" ");
    }
    public static void iterativepreorder(Node root){
        if(root==null) return;
        List<Integer> ans=new LinkedList<>();
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
             Node curr=s.pop();
            ans.add(curr.data);

            if(curr.right!=null) s.push(curr.right);
            if(curr.left!=null)  s.push(curr.left);

        }
        for(int i:ans) System.out.print(i+" ");
    }
    public static void iterativepostorder(Node root){
        if(root==null) return;
        List<Integer> ans=new ArrayList<>();
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            Node current=s1.pop();
            s2.push(current);
            if(current.left!=null) s1.push(current.left);
            if(current.right!=null) s1.push(current.right);

        }
        while(!s2.isEmpty()){
            ans.add(s2.pop().data);
        }
        for(int i:ans) System.out.print(i+" ");

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
       Node root= buildtree(arr);
       iterativeinorder(root);
       System.out.println();
       iterativepreorder(root);
       System.out.println();
       iterativepostorder(root);

    }
}
