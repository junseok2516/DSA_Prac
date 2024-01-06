import java.util.*;

public class ThreeSum15 {
    /* brute force O(n^3) - time limit exceeded */
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> answers = new HashSet<>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> tmpList = new ArrayList<>();
//                        tmpList.add(nums[i]);tmpList.add(nums[j]);tmpList.add(nums[k]);
//                        Collections.sort(tmpList);
//                        answers.add(tmpList);
//                    }
//                }
//            }
//        }
//        List<List<Integer>> results = new ArrayList<>(answers);
//        return results;
//    }

    /* got a solution (must re-try)s */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> tmpAns = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    tmpAns.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        ans.addAll(tmpAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

