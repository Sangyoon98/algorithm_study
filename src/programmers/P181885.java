package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181885 {
    public static void main(String[] args) {
        String[] todo_list1 = new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished1 = new boolean[]{true, false, true, false};
        String[] answer1 = new String[]{"practiceguitar", "studygraph"};
        String[] result1 = new programmers.P181885().solution(todo_list1, finished1);
        PRINT_RESULT(1, result1, answer1);
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

    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < finished.length; i++)
            if (!finished[i]) answer.add(todo_list[i]);

        return answer.toArray(new String[0]);
    }
}