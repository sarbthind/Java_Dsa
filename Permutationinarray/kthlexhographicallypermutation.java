import java.util.Arrays;

public class kthlexhographicallypermutation {
     public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If found, find the element just larger than nums[i]
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] kthPermutation(int[] arr, int k) {
        int[] nums = arr.clone(); // Copy original array
        for (int i = 0; i < k; i++) {
            nextPermutation(nums);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        int[] result = kthPermutation(arr, k);

        System.out.println("K-th next permutation: " + Arrays.toString(result));
    }
}
// 🧠 Time Complexity:

//     O(k * n) where n = arr.length

//     Each nextPermutation takes O(n) time