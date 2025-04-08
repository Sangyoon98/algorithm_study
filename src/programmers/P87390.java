package programmers;

import java.util.Arrays;

class P87390 {
    public static void main(String[] args) {
        int n1 = 3;
        long left1 = 2L;
        long right1 = 5L;
        int[] answer1 = new int[]{3, 2, 2, 3};
        int[] result1 = new programmers.P87390().solution(n1, left1, right1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 4;
        long left2 = 7L;
        long right2 = 14L;
        int[] answer2 = new int[]{4, 3, 3, 3, 4, 4, 4, 4};
        int[] result2 = new programmers.P87390().solution(n2, left2, right2);
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

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) right - (int) left + 1];
        int index = 0;

        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[index++] = Math.max((int) row, (int) col) + 1;
        }

        return answer;
    }
}