
class Solution {
        public void reverse(char[] ch,int k){
        int s=0;
        int e=k;
        while(s<e){
            char temp=ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s++;
            e--;
        }
    }
    public String finalString(String s) {
        char[] ch=s.toCharArray();
        char[] ans=new char[ch.length];
        int k=0;
        for(int j=0;j<ch.length;j++){
            if(ch[j]!='i'){
                ans[k++]=ch[j];
            }
            else{
                reverse(ans,k-1);
            }
        }
        return new String(ans,0,k);
    }
    }
  public class faultykeyword{
    public static void main(String[] args) {
        String str="pointer";
        Solution obj=new Solution();
        String result=obj.finalString(str);
        System.out.println(result);
    }

  }

