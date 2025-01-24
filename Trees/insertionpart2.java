import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class insertionpart2 {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=Createtree();
    };
    static Node Createtree(){
        Node root=null;
        System.out.println("Enter the data");
        int data=sc.nextInt();

        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter in the leftof the "+data);
        root.left=Createtree();
        System.out.println("enter in the right of the "+data);
        root.right=Createtree();
        return root;

    }

}
