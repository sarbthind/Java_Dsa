import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;

    }
} 


public class symmetricalttree {

    static Scanner sc=new Scanner(System.in);

    static boolean ismirror(Node leftsub,Node rightsub){
        if(leftsub==null&&rightsub==null){
            return true;
        }
        if(leftsub==null||rightsub==null){
            return false;
        }
        return (leftsub.data==rightsub.data)&&ismirror(leftsub.left, rightsub.right)&&ismirror(leftsub.right, rightsub.left);
    }
    
    static boolean isSymmetric(Node node){
        if(node==null){
            return true;
        }
        return ismirror(node.left, node.right);
    }
    static Node createTree(){
        Node root=null;
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("emter the leftvod the "+data);
        root.left=createTree();
        System.out.println("enter the right of the "+data);
        root.right=createTree();
        return root;
    }

    public static void main(String[] args) {
        Node root=createTree();
        System.out.println(isSymmetric(root));
    }
    
}
