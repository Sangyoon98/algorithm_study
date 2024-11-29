package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181901 {
    public static void main(String[] args) {
        int n1 = 10;
        int k1 = 3;
        int[] answer1 = new int[]{3, 6, 9};
        int[] result1 = new programmers.P181901().solution(n1, k1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 15;
        int k2 = 5;
        int[] answer2 = new int[]{5, 10, 15};
        int[] result2 = new programmers.P181901().solution(n2, k2);
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

    public int[] solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}