import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
    private Node root;
}
class heightoftree{

   static  Scanner sc=new Scanner(System.in);
    public static int height(Node node){
        if(node ==null){
            return 0;
        }
        int hl=height(node.left);
        int hr=height(node.right);
        int ans=Math.max(hl,hr)+1;
        return ans;

    }

    static int heightmethodtwo(Node node){
        if(node==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        int h=0;
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                h++;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }

        }
        return h;
    }
        static Node createTree(){
            Node root=null;
            System.out.println("enter teh data for the root node");
            int data=sc.nextInt();
            if(data==-1){
                return null;
            }
            root=new Node(data);
            System.out.println("Enter teh left of the "+data);
            root.left=createTree();
            System.out.println("enetrthe right of the "+data);
            root.right=createTree();
            return root;

        }
            
        //  //************************** */ Method to insert element using level order************************************
        //    static  Node root;
        //     heightoftree(){
        //         root=null;
        //     }
        // static  void insertLevelOrder(int value) {
        //         // If tree is empty, create root
        //         if (root == null) {
        //             root = new Node(value);
        //             return;
        //         }
                
        //         // Use queue for level order traversal
        //         Queue<Node> queue = new LinkedList<>();
        //         queue.add(root);
                
        //         // Do level order traversal until we find an empty spot
        //         while (!queue.isEmpty()) {
        //             Node current = queue.poll();
                    
        //             // If left child is empty, insert here
        //             if (current.left == null) {
        //                 current.left = new Node(value);
        //                 break;
        //             } else {
        //                 // If left exists, add it to queue
        //                 queue.add(current.left);
        //             }
                    
        //             // If right child is empty, insert here
        //             if (current.right == null) {
        //                 current.right = new Node(value);
        //                 break;
        //             } else {
        //                 // If right exists, add it to queue
        //                 queue.add(current.right);
        //             }
        //         }
            
            // }  

    
    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);

        Node root=createTree();
        System.out.println(height(root));
        System.out.println(heightmethodtwo(root));
        // // insert element one by one
        // heightoftree tree=new heightoftree();
        // for (int i = 1; i <= 7; i++) {
        //     tree.insertLevelOrder(i);
        // }
        // // insert using array
        // heightoftree tree2=new heightoftree();
        // int[] values = {10, 20, 30, 40, 50};
        // for (int value : values) {
        //     tree2.insertLevelOrder(value);
        // }
    }
    
}