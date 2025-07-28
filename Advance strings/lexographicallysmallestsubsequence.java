import java.util.Stack;

public class lexographicallysmallestsubsequence {
    public static String findsequesnce(String str){
        boolean[] visited=new boolean[256];
        int[] lastindex=new int[256];
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            lastindex[str.charAt(i)]=i;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(visited[c]) continue;
            while(!s.isEmpty()&& c<s.peek()&&lastindex[s.peek()]>i){
                visited[s.pop()]=false;
            }
            s.push(c);
            visited[c]=true;
        }
        StringBuilder ans=new StringBuilder();
        for(char c:s){
            ans.append(c);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="cbacdcbc";
       System.out.println( findsequesnce(s));
    }
}


// 🔹 i = 0, char = 'c'

//     Not visited ✅

//     Stack is empty, so we push 'c'
//     ➡ stack = [c], visited[c]=true

// 🔹 i = 1, char = 'b'

//     Not visited ✅

//     Top of stack = 'c', 'b' < 'c', and lastIndex['c']=7 > 1 (so 'c' comes again)
//     ✅ So we pop 'c' and mark it unvisited
//     ➡ stack = []

//     Now push 'b'
//     ➡ stack = [b], visited[b]=true

// 🔹 i = 2, char = 'a'

//     Not visited ✅

//     Top of stack = 'b', 'a' < 'b', lastIndex[b]=6 > 2 → Pop 'b'
//     ➡ stack = []

//     Push 'a'
//     ➡ stack = [a], visited[a]=true

// 🔹 i = 3, char = 'c'

//     Not visited ✅

//     Top = 'a', 'c' > 'a' → fine, just push
//     ➡ stack = [a, c], visited[c]=true

// 🔹 i = 4, char = 'd'

//     Not visited ✅

//     'd' > c' → push
//     ➡ stack = [a, c, d], visited[d]=true

// 🔹 i = 5, char = 'c' → Already visited ❌ → skip
// 🔹 i = 6, char = 'b'

//     Not visited ✅

//     Top = 'd', 'b' < d' and lastIndex[d]=4 < 6 ❌ (d won't come again) → can't remove d

//     Next top = 'c', 'b' < c' but lastIndex[c]=7 > 6 ✅ → pop c
//     ➡ stack = [a, d], visited[c]=false

//     Now top = 'a', 'b' > a' → push 'b'
//     ➡ stack = [a, d, b], visited[b]=true

// 🔹 i = 7, char = 'c'