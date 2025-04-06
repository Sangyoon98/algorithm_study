package programmers;

import java.util.Objects;

public class P12901 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String answer1 = "TUE";
        String result1 = new P12901().solution(a, b);
        PRINT_RESULT(1, result1, answer1);
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

    public String solution(int a, int b) {
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int sum = -1;

        for (int i = 0; i < a - 1; i++) sum += days[i];

        sum += b;
        return dayOfWeek[sum % 7];
    }
}
