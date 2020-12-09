package ch.yuhang.templates.algorithm;

public class BinarySearch {
    public static int search(int[] nums, int a) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == a) {
                return a;
            } else if (a >= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
