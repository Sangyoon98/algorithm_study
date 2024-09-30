package programmers;

import java.util.Arrays;

class P120813 {
    public static void main(String[] args) {
        int n1 = 10;
        int[] answer1 = new int[]{1, 3, 5, 7, 9};
        int[] result1 = new programmers.P120813().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 15;
        int[] answer2 = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        int[] result2 = new programmers.P120813().solution(n2);
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
        int len = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        int[] answer = new int[len];
        int a = 1;
        for (int i = 0; i < len; i++) {
            answer[i] = a;
            a += 2;
        }
        return answer;
    }
}