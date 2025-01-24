import java.util.*;
public class bstinsertion {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;
        
        public Node(int value) {
            this.value = value;
            this.height = 0;
        }
        
    }
    
    private Node root;
    
    // public bstinsertion() {
    // }
    
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void insert(int value) {
        root = insert(value, root);
    }
    
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        // If value is equal, we don't insert (BST property: no duplicates)
        
        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    
    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }
    // for populate in sorted
    // public void populate(int[] nums){
    //     populate(nums,0,nums.length);
    // }
    // private void populate(int[] nums,int s,int e){
    //     if(s>=e){
    //         return;
    //     }
    //     int mid=(s+e)/2;
    //     this.insert(nums[mid]);
    //     populate(nums,s,mid);
    //     populate(nums,mid+1,e);
    // }
    
    public boolean balanced() {
        return balanced(root);
    }
    
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        
        int balanceFactor = Math.abs(height(node.left) - height(node.right));
        return balanceFactor <= 1 && balanced(node.left) && balanced(node.right);
    }
    
    public void display() {
        display(this.root, "Root Node: ");
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
    
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }
    // dispaly inorder
    
    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
      
    }

    
    private void preorder(Node node){
        if(node==null){
            return;

        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
        
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }
    public void printLevelOrder(){
        printLevelOrder(root);
    }
    public void printLevelOrder(Node node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);  // marker for end of level
        
        int level = 1;
        System.out.println("Level " + level + ":");
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            
            // If we reach level marker
            if (current == null) {
                if (!queue.isEmpty()) {
                    level++;
                    System.out.println("\nLevel " + level + ":");
                    queue.add(null);  // marker for next level
                }
                continue;
            }
            
            // Print current node
            System.out.print(current.value + " ");
            
            // Add children to queue
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println("\n");
    }
    public void simpleLevelOrder(){
        simpleLevelOrder(root);
    }

    public void simpleLevelOrder(Node node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            System.out.print("Level nodes: ");
            
            for (int i = 1; i <=levelSize; i=i+2) {
                Node current = queue.poll();
                System.out.print(current.value + " ");
                
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        bstinsertion tree = new bstinsertion();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);
        // tree.display();
        tree.printLevelOrder();
        tree.simpleLevelOrder();
        // System.out.println(tree.balanced());
        // System.out.println(tree.height(tree.root)+1);
    }
}


