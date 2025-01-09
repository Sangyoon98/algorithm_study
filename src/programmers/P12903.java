package programmers;

import java.util.Objects;

public class P12903 {
    public static void main(String[] args) {
        String n1 = "abcde";
        String answer1 = "c";
        String result1 = new programmers.P12903().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        String n2 = "qwer";
        String answer2 = "we";
        String result2 = new programmers.P12903().solution(n2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = Objects.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String s) {
        String[] arr = s.split("");
        if (arr.length % 2 == 0) return arr[arr.length / 2 - 1] + arr[arr.length / 2];
        else return arr[arr.length / 2];
    }
}
