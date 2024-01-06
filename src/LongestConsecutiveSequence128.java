import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    /* O(n) is condition
    * can get it passed but the responded time is not much efficient
    * */
//    public static int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int count = 1;
//        int maxCnt = 1;
//
//        if (nums.length < 1) {
//            return 0;
//        }
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] + 1 == nums[i + 1]) {
//                count++;
//                if (count > maxCnt) {
//                    maxCnt = count;
//                }
//            } else if (nums[i] == nums[i + 1]) {
//                ;
//            } else {
//                count = 1;
//            }
//        }
//
//        return maxCnt;
//    }

    /* can understand now, need deeper understanding of idea
     */
    public static int longestConsecutive(int[] nums) {
        int max = 0;

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            // look left
            int num = nums[i];
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }

            // look right
            num = nums[i];
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {100,4,200,1,3,2};
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums3 = {1,2,3,5,6,7,8,9};
        int[] nums4 = {1,2,0,1};
        System.out.println(longestConsecutive(nums1));
//        System.out.println(longestConsecutive(nums2));
//        System.out.println(longestConsecutive(nums3));
//        System.out.println(longestConsecutive(nums4));
    }
}
