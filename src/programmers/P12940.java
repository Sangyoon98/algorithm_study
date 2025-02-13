package programmers;

import java.util.Arrays;

class P12940 {
    public static void main(String[] args) {
        int n1 = 3;
        int m1 = 12;
        int[] answer1 = new int[]{3, 12};
        int[] result1 = new programmers.P12940().solution(n1, m1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 2;
        int m2 = 5;
        int[] answer2 = new int[]{1, 10};
        int[] result2 = new programmers.P12940().solution(n2, m2);
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


    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];
        return answer;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}