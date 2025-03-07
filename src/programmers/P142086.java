package programmers;

import java.util.Arrays;

class P142086 {
    public static void main(String[] args) {
        String s1 = "banana";
        int[] answer1 = new int[]{-1, -1, -1, 2, 2, 2};
        int[] result1 = new programmers.P142086().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "foobar";
        int[] answer2 = new int[]{-1, -1, 1, -1, -1, -1};
        int[] result2 = new programmers.P142086().solution(s2);
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

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (sb.lastIndexOf(String.valueOf(s.charAt(i))) == -1) answer[i] = -1;
            else answer[i] = i - sb.lastIndexOf(String.valueOf(s.charAt(i)));
            sb.append(s.charAt(i));
        }

        return answer;
    }
}