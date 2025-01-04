package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181862 {
    public static void main(String[] args) {
        String myStr1 = "baconlettucetomato";
        String[] answer1 = new String[]{"onlettu", "etom", "to"};
        String[] result1 = new programmers.P181862().solution(myStr1);
        PRINT_RESULT(1, result1, answer1);

        String myStr2 = "abcd";
        String[] answer2 = new String[]{"d"};
        String[] result2 = new programmers.P181862().solution(myStr2);
        PRINT_RESULT(2, result2, answer2);

        String myStr3 = "cabab";
        String[] answer3 = new String[]{"EMPTY"};
        String[] result3 = new programmers.P181862().solution(myStr3);
        PRINT_RESULT(3, result3, answer3);
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

    public String[] solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String[] arr = myStr.split("[abc]+");

        for (String s : arr) {
            if (!s.isEmpty()) answer.add(s);
        }

        if (answer.isEmpty()) return new String[] {"EMPTY"};
        return answer.toArray(new String[0]);
    }
}