package programmers;

import java.util.Arrays;

class P120882 {
    public static void main(String[] args) {
        int[][] score1 = new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] answer1 = new int[]{1, 2, 4, 3};
        int[] result1 = new programmers.P120882().solution(score1);
        PRINT_RESULT(1, result1, answer1);

        int[][] score2 = new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[] answer2 = new int[]{4, 4, 6, 2, 2, 1, 7};
        int[] result2 = new programmers.P120882().solution(score2);
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

    public int[] solution(int[][] score) {
        double[] arr = new double[score.length];
        int[] answer = new int[arr.length];
        int count = 0;

        for (int i = 0 ; i < score.length; i++) {
            arr[i] = (double) (score[i][0] + score[i][1]) / 2;
        }

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (double k : arr) {
                if (arr[i] < k) count++;
            }
            answer[i] = count;
        }

        return answer;
    }
}