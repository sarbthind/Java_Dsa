public class firstuniquecharacter {
    public static void main(String[] args) {
        String str="aAbbccafddee";
        boolean flag=false;
        int[] arr=new int[256];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==1){
                System.out.println(i);
                flag=true;
                break;
            }
        }
        if(flag==false) System.out.println(-1);
        
    }
}
// ✅ If you do want to use a size-26 array (for lowercase letters only), then you must adjust the index like this:

// arr[str.charAt(i) - 'a']++;

// Why this works:

//     'a' - 'a' = 97 - 97 = 0

//     'b' - 'a' = 98 - 97 = 1
