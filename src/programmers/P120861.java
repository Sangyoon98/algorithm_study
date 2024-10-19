package programmers;

import java.util.Arrays;

class P120861 {
    public static void main(String[] args) {
        String[] keyinput1 = new String[]{"left", "right", "up", "right", "right"};
        int[] board1 = new int[]{11, 11};
        int[] answer1 = new int[]{2, 1};
        int[] result1 = new programmers.P120861().solution(keyinput1, board1);
        PRINT_RESULT(1, result1, answer1);

        String[] keyinput2 = new String[]{"down", "down", "down", "down", "down"};
        int[] board2 = new int[]{7, 9};
        int[] answer2 = new int[]{0, -4};
        int[] result2 = new programmers.P120861().solution(keyinput2, board2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, int[] result, int[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xMax = board[0] / 2;
        int yMax = board[1] / 2;

        for (String s : keyinput) {
            if (s.equals("left") && Math.abs(answer[0] - 1) <= xMax) answer[0]--;
            else if (s.equals("right") && Math.abs(answer[0] + 1) <= xMax) answer[0]++;
            else if (s.equals("up") && Math.abs(answer[1] + 1) <= yMax) answer[1]++;
            else if (s.equals("down") && Math.abs(answer[1] - 1) <= yMax) answer[1]--;
        }

        return answer;
    }
}