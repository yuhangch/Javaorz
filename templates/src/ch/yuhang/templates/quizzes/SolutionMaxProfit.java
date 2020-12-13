package ch.yuhang.templates.quizzes;

public class SolutionMaxProfit {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        if (prices == null || prices.length <= 0) {
            return 0;
        }

        for (int i = 1; i < prices.length; i++) {
            int out = prices[i];
            for (int j = 0; j < i; j++) {
                int in = prices[j];
                max = Math.max(max, out - in);
            }
        }
        return max;
    }

    public int maxProfit_2(int[] prices) {
        if (prices == null || prices.length <= 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
