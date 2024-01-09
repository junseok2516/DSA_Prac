import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinimuminRotatedSortedArray153 {
    // brutal way
//    public static int findMin(int[] nums) {
//        Arrays.sort(nums);
//        return nums[0];
//    }

    // use Binary Search
    // stuck at comparing both values and assigning s = m + 1
    public static int findMin(int[] nums) {
        int s = 0; int e = nums.length - 1;
        while (s < e) {
            int m = (s + e) / 2;
            if (nums[m] < nums[m+1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return nums[s];
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
        int nums2[] = {3,4,5,1,2};
        System.out.println(findMin(nums2));
        int nums3[] = {11,13,15,17};
        System.out.println(findMin(nums3));
    }
}
