package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P12932 {
    public static void main(String[] args) {
        long n1 = 12345L;
        int[] answer1 = new int[]{5, 4, 3, 2, 1};
        int[] result1 = new programmers.P12932().solution(n1);
        PRINT_RESULT(1, result1, answer1);
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

    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[s.length() - i - 1] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return answer;
    }
}