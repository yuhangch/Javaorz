package ch.yuhang.templates.quizzes;

import java.util.Arrays;

public class SolutionMerge {
    public static void merge_2(int[] nums1, int m, int[] nums2, int n) {
        if (m < 1) {
            nums1 = nums2;
            return;
        }
        if (nums2 == null || nums2.length < 1) {
            return;
        }
        int p1 = m - 1;
        int p2 = n - 1;
        int q = m + n - 1;
        while (q >= 0) {
            int v1 = nums1[p1];
            int v2 = nums2[p2];
            if (v2 > v1) {
                nums1[q] = v2;
                if (p2 > 0) {
                    p2--;
                } else {
                    break;
                }
            } else {
                nums1[q] = v1;
                if (p1 > 0) {
                    p1--;
                } else {
                    System.arraycopy(nums2,0,nums2,0,p2+1);
                }

            }
            q--;
        }
    }


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

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge_2(nums1,3,nums2,3 );
    }
}
