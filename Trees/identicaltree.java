import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }

}
// compelxity time and auxillary space O(n) and O(h);
public class identicaltree {
 
    static Scanner sc=new Scanner(System.in);
 
    static Node createTree(){
        Node root=null;
        // System.out.println("enter the data for the node ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter the left of the "+data);
        root.left=createTree();
        System.out.println("Enter right of the "+data);
        root.right=createTree();
        return root;

    }
    // Using recursive calls
    static boolean isIdentical(Node r1,Node r2){
        if(r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null){
            return false;
        }
        return (r1.data==r2.data)&&isIdentical(r1.left, r2.left)&&isIdentical(r1.right, r2.right);


    }
    // using queue data structure
    static boolean identical(Node r1,Node r2){
        if(r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null){
            return false;
        }
        Queue<Node> q1=new LinkedList<>();
        Queue<Node> q2=new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        while (!q1.isEmpty()&&q2.isEmpty()) {
            Node n1=q1.poll();
            Node n2=q2.poll();
            if(n1.data!=n2.data){
                return false;
            }
            if(n1.left!=null&&n2.left!=null){
                q1.add(n1.left);
                q2.add(n2.left);
            }
            else if(n1.left!=null||n2.left!=null){
                return false;
            }

            if(n1.right!=null&&n2.right!=null){
                q1.add(n1.right);
                q2.add(n2.right);

            }
            else if(n1.right!=null||n2.right!=null){
                return false;
            }
        }
        return q1.isEmpty()&&q2.isEmpty();
    }


    public static void main(String[] args) {
        //    // Representation of input binary tree 1
        // //        1
        // //       / \
        // //      2   3
        // //     /
        // //    4
        // Node r1 = new Node(1);
        // r1.left = new Node(2);
        // r1.right = new Node(3);
        // r1.left.left = new Node(4);

        // // Representation of input binary tree 2
        // //        1
        // //       / \
        // //      2   3
        // //     /
        // //    4
        // Node r2 = new Node(1);
        // r2.left = new Node(2);
        // r2.right = new Node(3);
        // r2.left.left = new Node(4);

        
        
        Node r1=createTree();
        Node r2=createTree();
        
        if (isIdentical(r1, r2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    
}
