package programmers;

import java.util.Arrays;

class P12933 {
    public static void main(String[] args) {
        long n1 = 118372L;
        long answer1 = 873211L;
        long result1 = new programmers.P12933().solution(n1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, long result, long answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public long solution(long n) {
        String answer = "";
        String N = Long.toString(n);
        char[] arr = N.toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) answer += arr[i];

        return Long.parseLong(answer);
    }
}