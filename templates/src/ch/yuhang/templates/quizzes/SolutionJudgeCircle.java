package ch.yuhang.templates.quizzes;

/**
 * @author Yuhang Chen
 * @date 2020/12/17
 */

public class SolutionJudgeCircle {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] moveChars = moves.toCharArray();
        for (char c :
                moveChars) {
            switch (c) {
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'R':
                    x++;
                    break;
                case 'D':
                    y--;
                default:
                    break;
            }

        }
        return (x == 0 && y == 0);
    }
}
