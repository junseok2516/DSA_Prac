import java.util.Arrays;

public class ProductofArrayExceptSelf238 {
    // not allowed O(n^2)
    // initialize the first index to 1
    // accumulated value for the next index to the right and to the left
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int init = 1;
        answer[0] = init;
        for (int i = 1; i < nums.length; i++) {
            init *= nums[i-1];
            answer[i] = init;
        }

        init = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            init *= nums[i + 1];
            answer[i] *= init;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
