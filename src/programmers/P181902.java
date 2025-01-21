package programmers;

import java.util.Arrays;

class P181902 {
    public static void main(String[] args) {
        String my_string1 = "Programmers";
        int[] answer1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] result1 = new programmers.P181902().solution(my_string1);
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

    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();

        for (char c : arr) {
            if (c >= 'A' && c <= 'Z') answer[c - 'A']++;
            else answer[c - 'a' + 26]++;
        }

        return answer;
    }
}