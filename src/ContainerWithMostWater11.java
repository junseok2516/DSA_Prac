public class ContainerWithMostWater11 {
    // height should be smaller one among two pointers
    // width should be the length between two pointers
    // each point starts at the rightmost and leftmost
    // and the smaller one moving forward (if left, then to the right vise-versa)
    // by calculating container per moving a point (left index must not exceed right index)
    // return the max container
    public static int maxArea(int[] height) {
        int leftP = 0;
        int rightP = height.length - 1;
        int max = 0;
        while (leftP < rightP) {
            int h = Math.min(height[leftP], height[rightP]);
            int w = rightP - leftP;
            max = Math.max(max, h*w);
            if (height[leftP] > height[rightP]) {
                rightP--;
            } else {
                leftP++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
