package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P42840 {
    public static void main(String[] args) {
        int[] answers1 = new int[]{1, 2, 3, 4, 5};
        int[] answer1 = new int[]{1};
        int[] result1 = new programmers.P42840().solution(answers1);
        PRINT_RESULT(1, result1, answer1);

        int[] answers2 = new int[]{1, 3, 2, 4, 2};
        int[] answer2 = new int[]{1, 2, 3};
        int[] result2 = new programmers.P42840().solution(answers2);
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

    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score1 = 0, score2 = 0, score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length]) score1++;
            if (answers[i] == num2[i % num2.length]) score2++;
            if (answers[i] == num3[i % num3.length]) score3++;
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int max = Math.max(score1, Math.max(score2, score3));

        if (max == score1) answer.add(1);
        if (max == score2) answer.add(2);
        if (max == score3) answer.add(3);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}