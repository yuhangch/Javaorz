package ch.yuhang.templates.quizzes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Yuhang Chen
 * @date 2020/12/17
 */

public class SolutionSelfDividingNumbers {
    public static boolean v(Integer num) {
        char[] nums = String.valueOf(num).toCharArray();
        Set<Integer> numsSet = new HashSet<>();
        for (char c :
                nums) {
            if (c == '0') {
                return false;
            }
            numsSet.add(Integer.valueOf(String.valueOf(c)));
        }

        for (int i:
             numsSet) {
            if (num % i != 0) {
                //System.out.printf("%d,%d,%s,%s \n",i,num, Arrays.toString(nums),Arrays.toString(numsSet.toArray()));
                return false;
            }
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        IntStream nums = IntStream.range(left, right + 1);
        return nums.filter(SolutionSelfDividingNumbers::v).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        selfDividingNumbers(1, 33);
    }
}
