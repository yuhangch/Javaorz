package ch.yuhang.templates.quizzes;

/**
 * @author Yuhang Chen
 * @date 2020/12/13
 */

public class SolutionNumWays {
    public int numWays(int n) {
        int p = 1;
        int q = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (p+q)% 1000000007;
            p = q;
            q = sum;
        }
        return p;
    }
}
