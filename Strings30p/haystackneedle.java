class haystackneedle{
    public static int check(String haystack,String needle){
        for(int i=0;i<haystack.length();i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack="goodbtbadbut";
        String needle="but";
       int ans= check(haystack,needle);
       System.out.println(ans);
    }
}