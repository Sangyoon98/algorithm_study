package programmers;

import java.util.Arrays;

class P12917 {
    public static void main(String[] args) {
        String s1 = "Zbcdefg";
        String answer1 = "gfedcbZ";
        String result1 = new programmers.P12917().solution(s1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        return sb.reverse().toString();
    }
}