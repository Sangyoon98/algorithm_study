package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P120897 {
    public static void main(String[] args) {
        int n1 = 24;
        int[] answer1 = new int[]{1, 2, 3, 4, 6, 8, 12, 24};
        int[] result1 = new programmers.P120897().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 29;
        int[] answer2 = new int[]{1, 29};
        int[] result2 = new programmers.P120897().solution(n2);
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

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}