import java.util.Stack;

class basics{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(32);
        st.push(9);
        System.out.println(st);

       
        System.out.println( st.peek());
        System.out.println(st.pop());
    }
}