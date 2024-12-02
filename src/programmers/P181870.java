package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181870 {
    public static void main(String[] args) {
        String[] strArr1 = new String[]{"and", "notad", "abcd"};
        String[] answer1 = new String[]{"and", "abcd"};
        String[] result1 = new programmers.P181870().solution(strArr1);
        PRINT_RESULT(1, result1, answer1);

        String[] strArr2 = new String[]{"there", "are", "no", "a", "ds"};
        String[] answer2 = new String[]{"there", "are", "no", "a", "ds"};
        String[] result2 = new programmers.P181870().solution(strArr2);
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

    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) answer.add(s);
        }
        return answer.toArray(new String[0]);
    }
}