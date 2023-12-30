import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    /* use hashmap keys for value, values for indices
        target - one of key = the other key then return their indices
        otherwise, false. O(n) because it has to go through for "remaining"
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> answers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (answers.containsKey(target - nums[i])) {
                return new int[]{answers.get(target - nums[i]), i};
            }
            answers.put(nums[i], i);
        }
        return new int[]{};
    }

    /* brute force O(n^2)
     */
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0 ; i < nums.length-1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (target - nums[i] == nums[j]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        int nums1[] = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums1, 6)));
        int nums2[] = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
    }
}
