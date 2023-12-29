import java.util.*;

public class ContainsDuplicate217 {
    /*
    * had thought of using Dictionary like in Python but was not properly using here
    * syntax of HashMap is needed to be known such popular ones
    * should try to think of this differently rather than only dictionary solution
    * */
    public static boolean Solution(int[] nums) {
        HashMap<Integer, Integer> answers = new HashMap<>();
        for (int num : nums) {
            if (answers.containsKey(num) && answers.get(num) > 1) {
                return true;
            }
            answers.put(num, answers.getOrDefault(num, 0) + 1);
        }
        return false;
    }

    /* Time Complexity: O(n) is possible when it is sorted
    *  then compare its current and the next one are the same
    *  return true if correct otherwise, return false.
    */
//    public static boolean Solution(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    /*
    Solve naìve way, choose one and do inner loop if there is the same one
     */
//    public static boolean Solution(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    /*
    Use of set, create a empty set.
    if not found, add. if found, return true;
     */
//    public static boolean Solution(int[] nums) {
//        Set<Integer> answers = new HashSet<>();
//        for (int num : nums) {
//            if (answers.contains(num)) {
//                return true;
//            }
//            answers.add(num);
//        }
//        return false;
//    }


        public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        Solution(nums1);
        Solution(nums2);
        Solution(nums3);
    }
}
