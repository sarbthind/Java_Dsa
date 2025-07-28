import java.util.*;
public class beautifularrangement {
    public static int count=0;
    public static void checkpermutation(int n,boolean[] visited,List<List<Integer>> ans,List<Integer> current ,int index){
        if(index>n){
            count++;
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]&&(i%index==0||index%i==0)){
                visited[i]=true;
                current.add(i);
                checkpermutation(n, visited, ans, current, index+1);
                current.remove(current.size()-1);
                visited[i]=false;
            }
        }
    }
    // leetcode 526
    public static void main(String[] args) {
        int n=2;
        boolean[] visited=new boolean[n+1];
        List<List<Integer>> ans=new ArrayList<>();
        checkpermutation(n,visited,ans,new ArrayList<>(),1);
        for(List<Integer> l:ans){
            System.out.println(l);
        }
        System.out.println(count);
    }
}

// 🚀 Problem: Beautiful Arrangement

// Leetcode 526 — https://leetcode.com/problems/beautiful-arrangement/

// Statement:
// Given an integer n, count the number of the beautiful arrangements that you can construct.

// A beautiful arrangement is defined as an array perm of length n such that:

// For every index i (1-based), either:
// 1. perm[i] % i == 0  OR
// 2. i % perm[i] == 0

// 📌 Example:

// Input: n = 2  
// Output: 2

// Explanation:
// The two beautiful arrangements are:
// 1. [1, 2] → 1 % 1 == 0, 2 % 2 == 0 ✅  
// 2. [2, 1] → 2 % 1 == 0, 1 % 2 == 1 ❌  But i % perm[i] == 0 for i=2 → 2 % 1 == 0 ✅  
// So both are valid.
