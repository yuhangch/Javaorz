package ch.yuhang.templates.quizzes;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Yuhang Chen
 * @date 2020/12/13
 */

public class SolutionIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (Integer i :
                nums1) {
            set.add(i);
        }
        for (Integer i :
                nums2) {
            if (set.contains(i) && !ans.contains(i)) {
                ans.add(i);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersection_2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        set.addAll(set1);
        set.retainAll(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));
        return null;
    }
}
