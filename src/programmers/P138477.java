package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

class P138477 {
    public static void main(String[] args) {
        int k1 = 3;
        int[] score1 = new int[]{10, 100, 20, 150, 1, 100, 200};
        int[] answer1 = new int[]{10, 10, 10, 20, 20, 100, 100};
        int[] result1 = new programmers.P138477().solution(k1, score1);
        PRINT_RESULT(1, result1, answer1);

        int k2 = 4;
        int[] score2 = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] answer2 = new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300};
        int[] result2 = new programmers.P138477().solution(k2, score2);
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

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) stack.push(score[i]);
            else if (stack.peek() < score[i]) {
                stack.pop();
                stack.push(score[i]);
            }
            stack.sort(Collections.reverseOrder());
            answer[i] = stack.peek();
        }

        return answer;
    }
}