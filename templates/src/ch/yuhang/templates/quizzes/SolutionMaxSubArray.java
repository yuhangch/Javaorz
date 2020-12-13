package ch.yuhang.templates.quizzes;

public class SolutionMaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int cache[] = new int[nums.length];
        cache[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cache[i - 1] > 0) {
                cache[i] = cache[i - 1] + nums[i];
            } else {
                cache[i] = nums[i];
            }

            if (cache[i] > max) {
                max = cache[i];
            }
        }
        return max;
    }
}
