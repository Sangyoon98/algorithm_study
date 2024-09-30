package programmers;

import java.util.Arrays;

class P120819 {
    public static void main(String[] args) {
        int money1 = 5500;
        int[] answer1 = new int[]{1, 0};
        int[] result1 = new programmers.P120819().solution(money1);
        PRINT_RESULT(1, result1, answer1);

        int money2 = 15000;
        int[] answer2 = new int[]{2, 4000};
        int[] result2 = new programmers.P120819().solution(money2);
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

    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}