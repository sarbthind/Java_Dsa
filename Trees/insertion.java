
import java.util.Scanner;

public class insertion {
    private Node root;
    
    public insertion() {
        this.root = null;
    }
    
    public static class Node {
        int value;
        Node left;
        Node right;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    public void populate(Scanner sc) {
        System.out.println("Enter the root value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    
    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter node to the left of the " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left node of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        
        System.out.println("Do you want to enter to the right of the " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value you want to enter to right of the " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    
    public void display() {
        display(root, "");
    }
    
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insertion tree = new insertion();
        tree.populate(sc);
        tree.display();
    }
}