package programmers;

import java.util.Arrays;

class P120886 {
    public static void main(String[] args) {
        String before1 = "olleh";
        String after1 = "hello";
        int answer1 = 1;
        int result1 = new programmers.P120886().solution(before1, after1);
        PRINT_RESULT(1, result1, answer1);

        String before2 = "allpe";
        String after2 = "apple";
        int answer2 = 0;
        int result2 = new programmers.P120886().solution(before2, after2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int solution(String before, String after) {
        char[] A = before.toCharArray();
        char[] B = after.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        return String.valueOf(A).equals(String.valueOf(B)) ? 1 : 0;
    }
}