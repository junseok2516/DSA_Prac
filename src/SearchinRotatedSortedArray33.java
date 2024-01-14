public class SearchinRotatedSortedArray33 {
    // must be O(log n)
    public static int search(int[] nums, int target) {
        int s = 0; int e = nums.length - 1;
        while (s < e) {
            int m = (s + e) / 2;
            if (nums[m] == target) return m;
            if (target < nums[m]) {
                if (target < nums[s]) {
                    s = m + 1;
                } else {
                    e = m;
                }
            } else if (target > nums[m]) {
                s = m + 1;
            }
        }
        return nums[s] == target ? s : -1;
    }

    public static void main(String[] args) {
        int nums1[] = {1};
        System.out.println(search(nums1, 1));
        System.out.println(search(nums1, 0));
        int nums2[] = {4,5,6,7,0,1,2};
        System.out.println(search(nums2, 3));
        int nums3[] = {1,3};
        System.out.println(search(nums3, 3));
    }
}
