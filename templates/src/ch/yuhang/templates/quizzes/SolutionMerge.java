package ch.yuhang.templates.quizzes;

public class SolutionMerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || nums2.length <= 0) {
            return;
        }
        int length1 = nums1.length;
        final int initialValue = 0;
        int line = 0;
        for (int i = 0; i < length1 - n; i++) {
            if (nums2[0] >= nums1[i]) {
                line = i;
                break;
            }
        }
        for (int i = line; i < length1 ; i++) {
            nums1[i + n] = nums1[i];
            nums1[i] = initialValue;
        }
        int c = line;
        int c1 = line + n;
        int c2 = 0;
        while (c < length1) {
            if (nums2[c2] < nums1[c1]) {

                nums1[c] = nums2[c2];
                c2++;
            } else if (nums2[c2] >= nums1[c1]) {
                nums1[c] = nums1[c1];
                c1++;
            }
            c++;
        }

    }
}
