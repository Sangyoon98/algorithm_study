package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P120913 {
    public static void main(String[] args) {
        String my_str1 = "abc1Addfggg4556b";
        int n1 = 6;
        String[] answer1 = new String[]{"abc1Ad", "dfggg4", "556b"};
        String[] result1 = new programmers.P120913().solution(my_str1, n1);
        PRINT_RESULT(1, result1, answer1);

        String my_str2 = "abcdef123";
        int n2 = 3;
        String[] answer2 = new String[]{"abc", "def", "123"};
        String[] result2 = new programmers.P120913().solution(my_str2, n2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, String[] result, String[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String[] solution(String my_str, int n) {
        int length = 0;
        if (my_str.length() % n == 0) length = my_str.length() / n;
        else length = my_str.length() / n + 1;
        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}