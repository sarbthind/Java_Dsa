public class countcharacter {
    public static void main(String[] args) {
        String str="sarbraj singh";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
            else continue;
        }
        System.out.println(count);
    }
}
