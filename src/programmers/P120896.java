package programmers;

import java.util.Arrays;

class P120896 {
    public static void main(String[] args) {
        String s1 = "abcabcadc";
        String answer1 = "d";
        String result1 = new programmers.P120896().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "abdc";
        String answer2 = "abcd";
        String result2 = new programmers.P120896().solution(s2);
        PRINT_RESULT(2, result2, answer2);

        String s3 = "hello";
        String answer3 = "eho";
        String result3 = new programmers.P120896().solution(s3);
        PRINT_RESULT(3, result3, answer3);
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
        StringBuilder answer = new StringBuilder();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for (char c : ch) {
            int count = 0;

            for (char value : ch)
                if (c == value) count++;

            if (count == 1) answer.append(c);
        }

        return answer.toString();
    }
}