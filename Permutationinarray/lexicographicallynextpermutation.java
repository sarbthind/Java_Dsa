import java.util.Arrays;

public class lexicographicallynextpermutation {
//     ✅ Problem 4: Lexicographically Next Permutation
// 🔍 Problem Statement:

// Given an array of numbers that represents a permutation of integers, find the next lexicographically greater permutation of numbers. If such arrangement is not possible (i.e., it's the last permutation), rearrange it as the lowest possible order (sorted in ascending order).

// You must do it in-place with only constant extra memory.
// ✨ Example:
// Example 1:

// Input: [1, 2, 3]
// Output: [1, 3, 2]
// Explanation: 123 → 132 is the next permutation in lexicographical order.
// Example 2:

// Input: [3, 2, 1]
// Output: [1, 2, 3]
// Explanation: 321 is the last permutation, so we return the first one.
// Example 3:

// Input: [1, 1, 5]
// Output: [1, 5, 1]
// }
public static void nextPermutation(int[] arr){
    int n=arr.length;
    int i=n-2;
    while(i>=0&&arr[i]>=arr[i+1]) i--;
    if(i>=0){
        int j=n-1;
        while(arr[j]<=arr[i]){
            j--;        
        }
        swap(arr,j,i);
    }
    reverse(arr,i+1,n-1);

    
}
public static void swap(int arr[],int j,int i){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
public static void reverse(int[] arr,int s,int e){
    while(s<e){
        swap(arr,s++,e--);
    }
}

public static void main(String[] args) {
     int[] nums = {4,3,2,1};
        nextPermutation(nums);

        System.out.println("Next Permutation:");
        System.out.println(Arrays.toString(nums));
}

}


// 🔍 Example Input:

// Let’s take:

// nums = [1, 3, 5, 4, 2]

// 🎯 Goal:

// Find the next lexicographically greater permutation.
// 🔹 STEP 1: Find the first decreasing element from right

// We start with this code:

// int i = n - 2;
// while (i >= 0 && nums[i] >= nums[i + 1]) {
//     i--;
// }

// ➤ Dry run:

// i = 3 → nums[3] = 4, nums[4] = 2 → 4 >= 2 → true → i--
// i = 2 → nums[2] = 5, nums[3] = 4 → 5 >= 4 → true → i--
// i = 1 → nums[1] = 3, nums[2] = 5 → 3 >= 5 → false → STOP

// ✅ Now, i = 1

// Why are we doing this?
// We are finding the first index i from the back where the sequence breaks from increasing to decreasing.

//     The part after i (i.e., from index 2 onward) is strictly decreasing.
//     That means we can rearrange it to get a greater permutation.

// 🔹 STEP 2: Find just-larger element to the right of nums[i] and swap

// Now this part runs:

// if (i >= 0) {
//     int j = n - 1;
//     while (nums[j] <= nums[i]) {
//         j--;
//     }
//     swap(nums, i, j);
// }

// ➤ Dry run:

// i = 1 → nums[i] = 3
// We now search from end to find the first number > 3

// j = 4 → nums[4] = 2 → 2 <= 3 → j--
// j = 3 → nums[3] = 4 → 4 > 3 ✅ Found!

// Swap nums[1] and nums[3]
// → nums = [1, 4, 5, 3, 2]

// ✅ So now we’ve increased the permutation slightly by swapping just the next larger number.
// 🔹 STEP 3: Reverse the right part (i.e., after index i)

// Now we reverse the subarray from i+1 = 2 to end:

// reverse(nums, i+1, n-1);

// Subarray = [5, 3, 2]
// Reverse it → [2, 3, 5]

// Final array: [1, 4, 2, 3, 5]

// ✅ This is the next lexicographical permutation after [1, 3, 5, 4, 2].
