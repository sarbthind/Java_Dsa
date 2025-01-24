import java.util.Stack;

public class insertioninstack {
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);st.push(5);
        System.out.println(st);
        int index=2;
        int val=8;
        Stack<Integer> ns=new Stack<>();
        while(st.size()>=index){
                ns.push(st.pop());       
            }

        ns.push(val);
        System.out.println(ns);

        while(ns.size()>0){
            st.push(ns.pop());
        }
        System.out.println(st);
    }
}


