package ch.yuhang.templates.quizzes;

/**
 * @author Yuhang Chen
 * @date 2020/12/21
 */

public class SolutionIsDeformation {
    public static boolean isDeformation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[256];
        for (char value : chars1) {
            map[value]++;
        }
        for (char c : chars2) {
            System.out.println(c);
            if (map[c]-- == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isDeformation("222","222"));
    }
}
