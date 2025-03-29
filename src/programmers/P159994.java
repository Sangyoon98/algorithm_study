package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class P159994 {
    public static void main(String[] args) {
        String[] cards11 = new String[]{"i", "drink", "water"};
        String[] cards21 = new String[]{"want", "to"};
        String[] goal1 = new String[]{"i", "want", "to", "drink", "water"};
        String answer1 = "Yes";
        String result1 = new programmers.P159994().solution(cards11, cards21, goal1);
        PRINT_RESULT(1, result1, answer1);

        String[] cards12 = new String[]{"i", "water", "drink"};
        String[] cards22 = new String[]{"want", "to"};
        String[] goal2 = new String[]{"i", "want", "to", "drink", "water"};
        String answer2 = "No";
        String result2 = new programmers.P159994().solution(cards12, cards22, goal2);
        PRINT_RESULT(2, result2, answer2);
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

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        for (String i : goal) {
            if (i.equals(queue1.peek())) queue1.poll();
            else if (i.equals(queue2.peek())) queue2.poll();
            else return "No";
        }

        return "Yes";
    }
}