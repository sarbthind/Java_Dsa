import java.util.Stack;

public class lexographicallsmallestpermutationthatmatchespattern {
    public static int[] smallestpermutation(String s){
        int n=s.length();
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[n+1];
        int idx=0;
        for(int i=0;i<=n;i++){
            stack.push(i+1);
            if(i==n||s.charAt(i)=='I'){
                while(!stack.isEmpty()){
                    res[idx++]=stack.pop();
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        String str="IDID";
        int[] res=smallestpermutation(str);
        for(int i:res){
            System.out.print(i+" ");
        }

    }
}

// 👉 Pattern = "IDID"

// We are to generate a permutation using numbers 1 to 5 (n = pattern.length + 1) that is:

//     Lexicographically smallest

//     Matches the pattern:

//         I → Increasing

//         D → Decreasing

// 🔧 Let’s Walk Through Step-by-Step

// We will push numbers from 1 to 5 into a stack one by one and flush (pop) when we see an 'I' or reach the end.

// Let’s initialize:

//     Stack = []

//     Result = []

//     Numbers: 1 to 5 (we use i + 1)

// Step 1: i = 0, number = 1

//     Pattern[0] = 'I'

//     Push 1 → Stack = [1]

//     Since it's 'I', we flush the stack → Result = [1]

// Step 2: i = 1, number = 2

//     Pattern[1] = 'D'

//     Push 2 → Stack = [2]

//     (Since it's 'D', we don’t pop yet)

// Step 3: i = 2, number = 3

//     Pattern[2] = 'I'

//     Push 3 → Stack = [2, 3]

//     It's 'I', so now we flush the stack (pop all elements in reverse):
//     → Result = [1, 3, 2]

// Step 4: i = 3, number = 4

//     Pattern[3] = 'D'

//     Push 4 → Stack = [4]

//     (Don't pop yet since it's 'D')

// Step 5: i = 4 (end of loop), number = 5

//     Push 5 → Stack = [4, 5]

//     Since it's the end, flush the stack:
//     → Result = [1, 3, 2, 5, 4]

// ✅ Final Output:

// 1 3 2 5 4

// This output is:

//     A valid permutation

//     Matches the pattern "IDID":

//         1 < 3 → I

//         3 > 2 → D

//         2 < 5 → I

//         5 > 4 → D

//     And it’s lexicographically smallest of all valid permutations.