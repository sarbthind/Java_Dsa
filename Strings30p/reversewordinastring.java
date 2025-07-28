public class reversewordinastring {
    public static String rev(String str){
        String[] arr=str.split(" +");
        int n=arr.length;
        StringBuilder ans=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            ans.append(arr[i]+" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        String str="he is a magician";
        String reverse=rev(str);
        System.out.println(reverse);
    }
}
