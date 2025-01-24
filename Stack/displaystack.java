import java.util.Stack;

public class displaystack {
    public static void printele(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        printele(st);
        System.out.println(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Stack<Integer> ns=new Stack<>();
        // while(st.size()>0){
        //     ns.push(st.pop());
        // }
        // System.out.println(ns);

        // while(ns.size()>0){
        //     int c=ns.pop();
        //     System.out.print(c+" ");
        //     st.push(c);
        // }
        // System.out.println();
        // System.out.println(st);

        // int n=st.size();
        // int[] arr=new int[n];
        // for(int i=n-1;i>=0;i--){
        //     arr[i]=st.pop();

        // }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int i=0;i<n;i++){
        //     st.push(arr[i]);
        // }
        // System.out.println(st);

        printele(st);

    }
}
